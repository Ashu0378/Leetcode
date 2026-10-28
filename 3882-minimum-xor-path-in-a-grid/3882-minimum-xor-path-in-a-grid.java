class Solution {
    public int minCost(int[][] grid) {
        int[][][] dp=new int[grid.length][grid[0].length][1024];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(grid,dp,0,0,0);
    }

    public int helper(int[][] grid,int[][][] dp,int row,int col,int xOr){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length) return Integer.MAX_VALUE;
        xOr^=grid[row][col];
        if(dp[row][col][xOr]!=-1) return dp[row][col][xOr];
        if(row==grid.length-1 && col==grid[0].length-1) return xOr;
        int down=helper(grid,dp,row+1,col,xOr);
        int right=helper(grid,dp,row,col+1,xOr);
        return dp[row][col][xOr]=Math.min(down,right);
    }
}