class Solution {
    // public boolean ans;
    public boolean isBipartite(int[][] graph) {
        // ans=true;
        int n=graph.length;
        int[] visited=new int[n];
        Arrays.fill(visited,-1);
        for(int i=0;i<graph.length;i++){
            if(visited[i]==-1) {
                if(!dfs(graph,1,visited,i)) return false;;
            }
        }
        // return ans;
        return true;
    }
    public boolean dfs(int[][] graph,int color,int[] visited,int i){
        if(visited[i]==-1){
            visited[i]=color;
        }
        else if(visited[i]!=color) return false;
        else{
            return true;
        }
        for(int num:graph[i]){
            if(dfs(graph,1-color,visited,num)==false) return false;
        }
        return true;
    }
    // public void bfs(int[][] graph,int[] visited,int i){
    //     Queue<Integer> q=new LinkedList<>();
    //     visited[i]=0;
    //     q.add(i);
    //     while(!q.isEmpty()){
    //         int front=q.remove();
    //         for(int ele:graph[front]){
    //             if(visited[ele]==visited[front]){
    //                 ans=false;
    //                 return;
    //             }
    //             if( visited[ele]==-1){
    //                 visited[ele]=1-visited[front];
    //                 q.add(ele);
    //             }
    //         }
    //     }
    //    // return true;

    // }
}