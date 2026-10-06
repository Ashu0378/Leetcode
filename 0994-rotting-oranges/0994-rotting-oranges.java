class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] time=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                time[i][j]=Integer.MAX_VALUE;
                
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    helper(grid,time,i,j,0);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE) return -1;
                    max=Math.max(max,time[i][j]);
                }
            }
        }
        return max;
    }
    public void helper(int[][] grid,int[][] time,int row,int col,int step){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col]==0) return;
        if(step>=time[row][col]) return;
        time[row][col]=step;
        helper(grid,time,row+1,col,step+1);
        helper(grid,time,row-1,col,step+1);
        helper(grid,time,row,col-1,step+1);
        helper(grid,time,row,col+1,step+1);
    }
}