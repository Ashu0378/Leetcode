class Solution {
    public class Triplet implements Comparable<Triplet>{
        int node;
        int parent;
        int cost;
        Triplet(int node,int parent,int cost){
            this.node=node;
            this.parent=parent;
            this.cost=cost;
        }
        public int compareTo(Triplet t){
            if(this.cost==t.cost) return this.node-t.node;
            return this.cost-t.cost;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean[] visited=new boolean[n];
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(0,-1,0));
        int sum=0;
        while(pq.size()>0){
            Triplet front=pq.remove();
            int node=front.node;
            int parent=front.parent;
            int cost=front.cost;
            if(visited[node]==true) continue;
            sum+=cost;
            visited[node]=true;
            for(int i=0;i<n;i++){
                if(i==node || i==parent) continue;
                if(visited[i]==true) continue;
                int x1=points[node][0],x2=points[i][0];
                int y1=points[node][1],y2=points[i][1];

                int tCost=Math.abs(x2-x1)+Math.abs(y2-y1);

                pq.add(new Triplet(i,node,tCost));
            }
        }
        return sum;
    }
}