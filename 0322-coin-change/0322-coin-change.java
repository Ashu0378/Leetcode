class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long[][] dp=new long[n][amount+1];
        for(long[] row:dp){
            Arrays.fill(row,-1);
        }
        int ans=(int)helper(coins,dp,amount,0);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public long helper(int[] coins,long[][] dp,int k,int i){
        if(i==coins.length){
            if(k==0) return 0;
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[i][k]!=-1) return dp[i][k];
        long skip=helper(coins,dp,k,i+1);
        if(k-coins[i]<0) return dp[i][k]=skip;
        long pick=1+helper(coins,dp,k-coins[i],i);
        return dp[i][k]=Math.min(skip,pick);
    }
}