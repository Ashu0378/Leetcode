class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(0,0,grid,dp);
    }
    public int helper(int i,int j,int[][] grid,int[][] dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(helper(i+1,j,grid,dp),helper(i,j+1,grid,dp));
    }
}