class Solution {
    public int minCost(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public int helper(int n,int[] dp){
        if(n==1) return 0;
        if(dp[n]!=-1) return dp[n];
        int a=n/2;
        int b=n-a;
        return dp[n]=a*b+helper(a,dp)+helper(b,dp);
    }
}