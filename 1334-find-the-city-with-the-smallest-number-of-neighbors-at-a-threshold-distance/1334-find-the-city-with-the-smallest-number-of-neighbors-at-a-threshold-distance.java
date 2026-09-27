class Solution {
    public int findTheCity(int n, int[][] edges, int t) {
        //Floyd Warshall

        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dist[i][j]=Integer.MAX_VALUE;
            }
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            dist[u][v]=wt;
            dist[v][u]=wt;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                if(i==k) continue;
                for(int j=0;j<n;j++){
                    if(j==k) continue;
                    if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE) continue;
                    dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }    
            }
        }
        int min=n;
        int res=-1;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                //if(i==j) continue;
                if(i!=j && dist[i][j]<=t) count++;
            }
            if(count<=min){
                min=count;
                res=i;
            }
        }
        return res;
    }
}