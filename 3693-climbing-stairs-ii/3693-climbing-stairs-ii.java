class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return helper(costs,dp,n);
    }
    public int helper(int[] cost,int[] dp,int i){
        if(i<0) return Integer.MAX_VALUE/2;
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];

        int one=helper(cost,dp,i-1)+cost[i-1]+1;
        int two=helper(cost,dp,i-2)+cost[i-1]+4;
        int three=helper(cost,dp,i-3)+cost[i-1]+9;

        return dp[i]=Math.min(one,Math.min(two,three));
    }
    
}   