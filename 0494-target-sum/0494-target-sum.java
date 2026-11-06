class Solution {
    static int sum;
    public int findTargetSumWays(int[] nums, int target) {
        sum=0;
        for(int num:nums) sum+=num;
        int[][] dp=new int[nums.length][2*sum+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(nums,dp,0,target,0);
        
    }
    public int helper(int[] nums,int[][] dp,int res,int k,int i){
        if(i==nums.length){
            if(res==k) return 1;
            else return 0;
        }
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int skip=helper(nums,dp,res+nums[i],k,i+1);
        int pick=helper(nums,dp,res-nums[i],k,i+1);
        return dp[i][res+sum]=skip+pick;
    }
}