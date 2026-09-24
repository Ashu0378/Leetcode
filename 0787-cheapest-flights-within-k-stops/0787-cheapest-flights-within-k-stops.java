class Solution {
    public class Pair{
        int node;
        int cost;
        Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
    }
    public class Triplet implements Comparable<Triplet>{
        int node;
        int cost;
        int step;
        Triplet(int node,int cost,int step){
            this.node=node;
            this.cost=cost;
            this.step=step;
        }
        public int compareTo(Triplet t){
            if(this.step==t.step) return Integer.compare(this.cost,t.cost);
            return Integer.compare(this.step,t.step);
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<Pair>());
        for(int i=0;i<flights.length;i++){
            int u=flights[i][0];
            int v=flights[i][1];
            int c=flights[i][2];
            adj.get(u).add(new Pair(v,c));
        }
        int[] ans=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src]=0;
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        pq.add(new Triplet(src,0,0));
        while(pq.size()>0){
            Triplet front=pq.poll();
            int node=front.node;
            int cost=front.cost;
            int step=front.step;
            // if(node==dst) return cost;
            if(step==k+1) continue;
            for(Pair p:adj.get(node)){
                int totalCost=cost+p.cost;
                if(totalCost < ans[p.node]){
                    ans[p.node]=totalCost;
                    pq.add(new Triplet(p.node,totalCost,step+1));
                }
            }
        }
        return ans[dst]==Integer.MAX_VALUE?-1:ans[dst];
    }
}