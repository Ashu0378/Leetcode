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
                    dfs(grid,time,i,j,0);
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
    public void dfs(int[][] grid,int[][] time,int i,int j,int step){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0) return;
        if(step>time[i][j]) return;
        time[i][j]=step;
        dfs(grid,time,i+1,j,step+1);
        dfs(grid,time,i-1,j,step+1);
        dfs(grid,time,i,j+1,step+1);
        dfs(grid,time,i,j-1,step+1);
    }
}