class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int k;
        int steps;
        Triplet(int row,int col,int k,int steps){
            this.row=row;
            this.col=col;
            this.k=k;
            this.steps=steps;
        }
        public int compareTo(Triplet t){
            return Integer.compare(this.steps,t.steps);
        }

    }
    public int shortestPath(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dist={{0,1},{0,-1},{1,0},{-1,0}};
        int[][] minK=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(minK[i],Integer.MAX_VALUE);
        }
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(0,0,0,0));
        minK[0][0]=0;
        while(pq.size()>0){
            Triplet front=pq.poll();
            int row=front.row;
            int col=front.col;
            if(row==m-1 && col==n-1) return front.steps;
            for(int i=0;i<=3;i++){
                int i_=row+dist[i][0];
                int j_=col+dist[i][1];
                if(i_>=0 && i_<m && j_>=0 && j_<n){
                    int newK=front.k+grid[i_][j_];
                    if(newK<=k && minK[i_][j_]>newK){
                        minK[i_][j_]=newK;
                        pq.add(new Triplet(i_,j_,newK,front.steps+1));
                    }
                    
                }
            }
        }
        return -1;
    }
}