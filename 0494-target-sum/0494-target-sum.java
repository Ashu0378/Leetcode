class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        // int[][] dp=new int[nums.length][target+1];

        // for(int[] row:dp){
        //     Arrays.fill(row,-1);
        // }
        return helper(nums,target,0);
        
    }
    public int helper(int[] nums,int k,int i){
        if(i==nums.length){
            if(k==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        // if(dp[i][k]!=-1) return dp[i][k];
        int skip=helper(nums,k-nums[i],i+1);
        int pick=helper(nums,k+nums[i],i+1);
        return skip+pick;
        
    }
}