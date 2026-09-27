class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.max(helper(nums,n-1,dp),helper(nums,n-2,dp));
    }
    public int helper(int[] nums,int idx,int[] dp){
        if(idx<0) return 0;
        if(idx==0) return nums[idx];
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=nums[idx]+Math.max(helper(nums,idx-2,dp),helper(nums,idx-3,dp));
    }
}