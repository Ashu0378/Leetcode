class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-101);
        }
        for(int i=0;i<n;i++){
            helper(matrix,dp,0,i);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(dp[0][i]<min){
                min=dp[0][i];
            }
        }
        return min;
    }
    public int helper(int[][] grid,int[][] dp,int i,int j){
        if(j<0 || j>=grid[0].length || i>=grid.length) return Integer.MAX_VALUE;
        if(dp[i][j]!=-101) return dp[i][j];
        if(i==grid.length-1) return dp[i][j]=grid[i][j];

        return dp[i][j]=grid[i][j]+Math.min(helper(grid,dp,i+1,j),Math.min(helper(grid,dp,i+1,j-1),helper(grid,dp,i+1,j+1)));
    }
}