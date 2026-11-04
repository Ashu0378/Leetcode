class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        int target=sum/2;
        int[][] dp=new int[n][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(nums,dp,target,0);
    }
    public boolean helper(int[] nums,int[][] dp,int k,int i){
        if(i==nums.length){
            return k==0;
        }
        if(dp[i][k]!=-1) return dp[i][k]==1;
        boolean ans=false;
        boolean skip=helper(nums,dp,k,i+1);
        if(k-nums[i]<0){
            ans=skip;
            dp[i][k]=(ans)?1:0;
            return ans;
        }
        else{
            boolean pick=helper(nums,dp,k-nums[i],i+1);
            ans= pick || skip;
            
        }
        dp[i][k]=(ans)?1:0;
        return ans;
    }
}