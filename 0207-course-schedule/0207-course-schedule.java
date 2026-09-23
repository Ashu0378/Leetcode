class Solution {
    public boolean canFinish(int n, int[][] pre) {
        //topo sort
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDeg=new int[n];
        for(int i=0;i<pre.length;i++){
            int a=pre[i][0];
            int b=pre[i][1];
            adj.get(b).add(a);
            inDeg[a]++;
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
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
        if(ans.size()==n) return true;
        return false;
    }
}