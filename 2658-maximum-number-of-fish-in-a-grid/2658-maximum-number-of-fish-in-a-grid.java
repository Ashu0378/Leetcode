class Solution {
    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0 && !vis[i][j]){
                    int curr=helper(grid,i,j,vis);
                    max=Math.max(max,curr);
                }
            }
        }
        return max;
    }
    public int helper(int[][] grid,int row,int col,boolean[][] vis){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || vis[row][col] || grid[row][col]==0) return 0;
        vis[row][col]=true;

        int sum=grid[row][col];
        
        sum+=helper(grid,row+1,col,vis);
        sum+=helper(grid,row-1,col,vis);
        sum+=helper(grid,row,col+1,vis);
        sum+=helper(grid,row,col-1,vis);
        return sum;
    }
}