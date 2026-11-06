class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        long[][] dp=new long[nums.size()][target+1];
        for(long[] row:dp) Arrays.fill(row,-1);

        int ans=(int)helper(nums,dp,0,target);
        return ans==Integer.MIN_VALUE?-1:ans;
    }
    public long helper(List<Integer> nums,long[][] dp,int i,int k){
        if(i==nums.size()){
            if(k==0) return 0;
            else{
                return Integer.MIN_VALUE;
            }
        }
        if(dp[i][k]!=-1) return dp[i][k];
        long skip=helper(nums,dp,i+1,k);
        long pick=Integer.MIN_VALUE;
        if(k>=nums.get(i)){
            long temp=helper(nums,dp,i+1,k-nums.get(i));
            if(temp!=Integer.MIN_VALUE) pick=1+temp;
        }
        return dp[i][k]=Math.max(skip,pick);
    }
}