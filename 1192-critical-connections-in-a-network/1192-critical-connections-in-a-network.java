class Solution {
    int timer=1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<connections.size();i++){
            int a=connections.get(i).get(0);
            int b=connections.get(i).get(1);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        int[] visited=new int[n];
        int[] tin=new int[n];
        int[] low=new int[n];
        List<List<Integer>> ans=new ArrayList<>();
        dfs(0,-1,visited,tin,low,adj,ans);
        return ans;
    }
    public void dfs(int node,int parent,int[] visited,int[] tin,int[] low,List<List<Integer>> adj,List<List<Integer>> ans){
        visited[node]=1;
        tin[node]=low[node]=timer;
        timer++;
        for(int it:adj.get(node)){
            if(it==parent) continue;
            if(visited[it]==0){
                dfs(it,node,visited,tin,low,adj,ans);
                low[node]=Math.min(low[node],low[it]);
                if(low[it]>tin[node]){
                    ans.add(Arrays.asList(it,node));
                }
            }
            else{
                low[node]=Math.min(low[node],low[it]);
            }
        }
    }
}