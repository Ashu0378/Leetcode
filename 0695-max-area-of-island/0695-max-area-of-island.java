class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int temp=helper(grid,visited,i,j);
                    max=Math.max(max,temp);
                }
            }
        }
        return max;
    }
    public int helper(int[][] grid,boolean[][] visited,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || visited[i][j]) return 0;
        visited[i][j]=true;
        return 1+helper(grid,visited,i+1,j)+helper(grid,visited,i-1,j)+helper(grid,visited,i,j+1)+helper(grid,visited,i,j-1);
    }
}