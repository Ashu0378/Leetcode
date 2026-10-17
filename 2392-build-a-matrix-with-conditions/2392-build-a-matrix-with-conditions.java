class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        List<Integer> row=helper(k,rowConditions);
        List<Integer> col=helper(k,colConditions);
        if(row.size()<k || col.size()<k) return new int[0][0];
        int[][] ans=new int[k][k];
        int[] rowIndex = new int[k + 1];
        int[] colIndex = new int[k + 1];
        
        for (int i = 0; i < k; i++) {
            rowIndex[row.get(i)] = i;
            colIndex[col.get(i)] = i;
        }
        for(int i=1;i<=k;i++){
            ans[rowIndex[i]][colIndex[i]]=i;
        }
        return ans;
    }
    public List<Integer> helper(int n, int[][] pre) {
        //topo sort
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDeg=new int[n+1];
        for(int[] p:pre){
            int u=p[0];
            int v=p[1];
            adj.get(u).add(v);
            inDeg[v]++;
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(q.size()>0){
            int front=q.poll();
            ans.add(front);
            for(int ele:adj.get(front)){
                inDeg[ele]--;
                if(inDeg[ele]==0){
                    q.add(ele);
                }

            }
        }
        return ans;
    }
}