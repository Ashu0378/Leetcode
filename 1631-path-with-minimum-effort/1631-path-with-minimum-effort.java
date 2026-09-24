class Solution {
    public class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int distance;
        Triplet(int row,int col,int distance){
            this.row=row;
            this.col=col;
            this.distance=distance;
        }
        public int compareTo(Triplet t){
            return this.distance-t.distance;
        }
    }
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=Integer.MAX_VALUE;
            }
        }
        ans[0][0]=0;
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));
        while(pq.size()>0){
            Triplet front=pq.remove();
            int row=front.row;
            int col=front.col;
            int distance=front.distance;
            if(row==m-1 && col==n-1) break;
            if(row>0){
                int effort=Math.abs(heights[row][col]-heights[row-1][col]);
                effort=Math.max(effort,distance);
                if(effort< ans[row-1][col]){
                    ans[row-1][col]=effort;
                    pq.add(new Triplet(row-1,col,effort));
                }
            }
            if(row<m-1){
                int effort=Math.abs(heights[row][col]-heights[row+1][col]);
                effort=Math.max(effort,distance);
                if(effort< ans[row+1][col]){
                    ans[row+1][col]=effort;
                    pq.add(new Triplet(row+1,col,effort));
                }
            }
            if(col<n-1){
                int effort=Math.abs(heights[row][col]-heights[row][col+1]);
                effort=Math.max(effort,distance);
                if(effort< ans[row][col+1]){
                    ans[row][col+1]=effort;
                    pq.add(new Triplet(row,col+1,effort));
                }
            }
            if(col>0){
                int effort=Math.abs(heights[row][col]-heights[row][col-1]);
                effort=Math.max(effort,distance);
                if(effort< ans[row][col-1]){
                    ans[row][col-1]=effort;
                    pq.add(new Triplet(row,col-1,effort));
                }
            }
        }
        return ans[m-1][n-1];
    }
}