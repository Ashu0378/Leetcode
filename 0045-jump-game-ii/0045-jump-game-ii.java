class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        
        return helper(dp,nums,0,n-1);
    }
    public int helper(int[] dp,int[] nums,int curr,int dest){
        if(curr>=dest) return 0;
        if(dp[curr]!=-1) return dp[curr];
        int temp=Integer.MAX_VALUE;
        for(int i=1;i<=nums[curr];i++){
            if(i+curr>dest) break;
            int res=helper(dp,nums,curr+i,dest);
            if(res!=Integer.MAX_VALUE) temp=Math.min(temp,1+res);
        }
        return dp[curr]=temp;
    }
}