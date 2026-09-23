class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        boolean[] isVisited=new boolean[n];
        boolean[] path=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isVisited[i]){
                if(dfs(i,adj,isVisited,path)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int curr,List<List<Integer>> adj,boolean[] vis,boolean[] path){
        vis[curr]=true;
        path[curr]=true;
        for(int a:adj.get(curr)){
            if(!vis[a] && dfs(a,adj,vis,path)) return true;
            else if(path[a]) return true;
        }
        path[curr]=false;
        return false;
    }
}