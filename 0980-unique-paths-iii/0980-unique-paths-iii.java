class Solution {
    public int count;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dfs(grid,visited,i,j);
                    break;                    
                }
            }
        }
        return count;
    }
    public void dfs(int[][] grid,boolean[][] visited,int row,int col){
        if(row<0 || col<0 || row>grid.length-1 || col>grid[0].length-1 || visited[row][col]==true || grid[row][col]==-1){
            return;
        }
        visited[row][col]=true;
        if(grid[row][col]==2){
            if(check(grid,visited)){
                count++;
            }
        }
        dfs(grid,visited,row+1,col);
        dfs(grid,visited,row,col+1);
        dfs(grid,visited,row-1,col);
        dfs(grid,visited,row,col-1);
        visited[row][col]=false;
    }
    public boolean check(int[][] grid,boolean[][] visited){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int num=grid[i][j];
                if(num!=-1 && visited[i][j]==false){
                    return false;
                }
            }
        }
        return true;
    }
}