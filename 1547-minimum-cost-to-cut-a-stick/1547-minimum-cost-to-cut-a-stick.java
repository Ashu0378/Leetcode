class Solution {
    int[][] dp;
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;
        dp=new int[m+1][m+1];
        for(int[] cut:dp){
            Arrays.fill(cut,-1);
        }
        Arrays.sort(cuts);
        return helper(0,n,cuts,0,cuts.length-1);
    }
    public int helper(int start,int end,int[] cuts,int i,int j){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int cost=Integer.MAX_VALUE;
        for(int x=i;x<=j;x++){
            int left=helper(start,cuts[x],cuts,i,x-1);
            int right=helper(cuts[x],end,cuts,x+1,j);
            int curr=(end-start)+left+right;
            cost=Math.min(cost,curr);
        }
        return dp[i][j]=cost;
    }


}