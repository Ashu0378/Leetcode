class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
        }
        Map<Integer,Integer> visited=new HashMap<>();
        for(int i = 0; i < n; i++){
            visited.put(i,0);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!dfs(i,visited,adj,ans)) return new int[0];
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=ans.get(n-i-1);
        }
        return result;
    }
    public boolean dfs(int i,Map<Integer,Integer> visited,List<List<Integer>> adj,List<Integer> res){
        int visit=visited.get(i);
        if(visit==2) return true;
        if(visit==1) return false;
        visited.put(i,1);
        for(int ele:adj.get(i)){
            if(!dfs(ele,visited,adj,res)) return false;
        }
        visited.put(i,2);
        res.add(i);
        return true;
    }
}