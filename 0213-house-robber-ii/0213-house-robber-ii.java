class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        //if(n==2) return 0;
        int[] dp=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        return Math.max(helper(nums,n-1,dp,-1),helper(nums,n-2,dp2,1)); //-1 means skip and 1 means not skip
    }
    public int helper(int[] nums,int idx,int[] dp,int symbol){
        if(idx<0) return 0;
        if(idx==0 && symbol==-1) return 0;
        if(idx==0) return nums[0];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=Math.max(nums[idx]+helper(nums,idx-2,dp,symbol),helper(nums,idx-1,dp,symbol));
    }
}