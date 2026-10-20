class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int cost;
        Triplet(int row,int col,int cost){
            this.row=row;
            this.col=col;
            this.cost=cost;
        }
        public int compareTo(Triplet t){
            return this.cost-t.cost;
        }
    }
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        int[][] minCost=new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(minCost[i], Integer.MAX_VALUE);
        }
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));
        minCost[0][0]=0;
        while(pq.size()>0){
            Triplet front=pq.poll();
            int cost=front.cost;
            int row=front.row;
            int col=front.col;
            for(int i=0;i<=3;i++){
                int i_=row+dir[i][0];
                int j_=col+dir[i][1];
                if(i_>=0 && i_<m && j_>=0 && j_<n){
                    int gridDir=grid[row][col];
                    int newCost=cost+((gridDir-1!=i)?1:0);
                    if(newCost<minCost[i_][j_]){
                        minCost[i_][j_]=newCost;
                        pq.add(new Triplet(i_,j_,newCost));
                    }
                }
                
            }
        }
        return minCost[m-1][n-1];
    }
}