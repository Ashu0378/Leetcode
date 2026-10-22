class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n=quiet.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] rich:richer){
            int u=rich[0];
            int v=rich[1];
            adj.get(u).add(v);
        }
        int[] indeg=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<adj.get(i).size();j++){
                int x=adj.get(i).get(j);
                indeg[x]++;
            }
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=i;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) {
            if(indeg[i]==0) q.add(i);
        }
        int[] topo=new int[n];
        while(q.size()>0){
            int front=q.poll();
            for(int node:adj.get(front)){
                if(quiet[ans[front]]<quiet[ans[node]]){
                    ans[node]=ans[front];
                }
                indeg[node]--;
                if(indeg[node]==0) q.add(node);
            }
        }
        return ans;
    }

}