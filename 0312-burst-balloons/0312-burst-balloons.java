class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length+2;
        int[] arr=new int[n];
        arr[0]=1;
        arr[n-1]=1;

        for(int i=1;i<n-1;i++){
            arr[i]=nums[i-1];
        }

        int[][] dp=new int[n][n];

        for(int[] dp_:dp){
            Arrays.fill(dp_,-1);
        }

        return helper(arr,dp,1,n-2);
    }
    public int helper(int[] nums,int[][] dp,int i,int j){
        if(i>j) return 0;

        if(i==j){
            return nums[i]*nums[i-1]*nums[i+1];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=0;
        for(int k=i;k<=j;k++){
            int coins=nums[k]*nums[i-1]*nums[j+1];
            coins+=helper(nums,dp,i,k-1);
            coins+=helper(nums,dp,k+1,j);

            ans=Math.max(ans,coins);
        }
        return dp[i][j]=ans;
    }
}