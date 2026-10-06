class Solution {
    public class Triplet{
        int row;
        int col;
        int weight;
        Triplet(int row,int col,int weight){
            this.row=row;
            this.col=col;
            this.weight=weight;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        int fresh=0;
        Queue<Triplet> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                     visited[i][j]=true;
                    q.add(new Triplet(i,j,0));
                }
                if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        int max=0;
        while(q.size()>0){
                Triplet t=q.remove();
                int row=t.row;
                int col=t.col;
                int time=t.weight;
                max=Math.max(max,time);
                if(row-1 >=0 && !visited[row-1][col] && grid[row-1][col]==1){
                    q.add(new Triplet(row-1,col,time+1));
                    visited[row-1][col]=true;
                    fresh--;
                }
                if(col-1 >=0 && !visited[row][col-1] && grid[row][col-1]==1){
                    q.add(new Triplet(row,col-1,time+1));
                    visited[row][col-1]=true;
                    fresh--;
                }
                if(row+1 <grid.length && !visited[row+1][col] && grid[row+1][col]==1){
                    q.add(new Triplet(row+1,col,time+1));
                    visited[row+1][col]=true;
                    fresh--;
                }
                if(col+1 <grid[0].length && !visited[row][col+1] && grid[row][col+1]==1){
                    q.add(new Triplet(row,col+1,time+1));
                    visited[row][col+1]=true;
                    fresh--;
                }
        }
        return fresh==0?max:-1;
    }
    
}