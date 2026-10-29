class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        int[][] dp=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        dp[0][0]=1;
        return helper(obstacleGrid,dp,m-1,n-1);
    }
    public int helper(int[][] grid,int[][] dp,int m,int n){
        if(m<0 || n<0 || grid[m][n]==1) return 0;
        // if(m==0 || n==0) return 1;

        if(dp[m][n]!=-1) return dp[m][n];

        return dp[m][n]=helper(grid,dp,m-1,n)+helper(grid,dp,m,n-1);
    }

}