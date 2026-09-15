class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(Arrays.asList(0));
        int len=graph.length-1;
        while(!q.isEmpty()){
            List<Integer> x=q.poll();
            int curr=x.get(x.size()-1);
            if(curr==len){
                ans.add(new ArrayList(x));
            }
            for(int num:graph[curr]){
                List<Integer> nP=new ArrayList(x);
                nP.add(num);
                q.add(nP);
            }
        }
        return ans;
    }
}