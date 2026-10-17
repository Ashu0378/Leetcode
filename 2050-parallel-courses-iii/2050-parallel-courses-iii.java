class Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        List<List<Integer>> adj=new ArrayList<>();
        int[] indeg =new int[n+1];
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] r:relations){
            int u=r[0];
            int v=r[1];
            indeg[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q=new LinkedList<>();
        int[] dist = new int[n + 1];
        for(int i=1;i<=n;i++){
            if(indeg[i]==0){
                q.add(i);
                dist[i]=time[i-1];
            }
        }
        int totalTime=0;
        while(q.size()!=0){
            int front=q.poll();
            totalTime=Math.max(totalTime,dist[front]);
            for(int ele:adj.get(front)){
                dist[ele]=Math.max(dist[ele],dist[front]+time[ele-1]);
                indeg[ele]--;
                if(indeg[ele]==0) q.add(ele);
            }
        }
        return totalTime;
    }
}