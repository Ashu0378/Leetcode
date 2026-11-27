class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        int n=coins.length;
        dp=new int[n][amount+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(coins,0,amount);
    }
    public int helper(int[] coins,int idx,int amount){
        if(amount==0) return 1;
        if(idx==coins.length) return 0;

        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        int take=0;
        if(amount>=coins[idx]){
            take=helper(coins,idx,amount-coins[idx]);
        }
        int skip=helper(coins,idx+1,amount);
        return dp[idx][amount]=skip+take;
    }
}