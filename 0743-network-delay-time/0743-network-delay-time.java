class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        //Bellman Ford

        int[] ans=new int[n+1];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<times.length;j++){
                int u=times[j][0];
                int v=times[j][1];
                int wt=times[j][2];
                //if(ans[u]==Integer.MAX_VALUE) continue;
                if(ans[u]!=Integer.MAX_VALUE && ans[u]+wt < ans[v]){
                    ans[v]=ans[u]+wt;
                }
                // else{
                //     continue;
                // }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=1;i<ans.length;i++){
            if(max<ans[i]){
                max=ans[i];
            }
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}