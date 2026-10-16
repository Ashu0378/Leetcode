class Solution {
    int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
    int n;
    public int swimInWater(int[][] grid) {
        n=grid.length;
        int low=0;
        int high=n*n-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean[][] visited=new boolean[n][n];
            if(dfs(grid,visited,0,0,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean dfs(int[][] grid,boolean[][] visited,int row,int col,int target){
        if(row<0 || col<0 || row>=n || col>=n || visited[row][col] || grid[row][col]>target) return false;
        visited[row][col]=true;
        if(row==n-1 && col==n-1) return true;
        for(int[] dir:directions){
            int i=dir[0];
            int j=dir[1];
            if(dfs(grid,visited,row+i,col+j,target)){
                return true;
            }
        }
        return false;
    }
}