class Solution {
    int[] parent;
    int[] size;
    public int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    public void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        if(rootX==rootY) return;

        if(size[rootX]>size[rootY]){
            parent[rootX]=rootY;
        }
        else if(size[rootX]<size[rootY]){
            parent[rootY]=rootX;
        }
        else{
            parent[rootY]=rootX;
            size[rootX]++;
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int provinces=n;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isConnected[i][j]==1){
                    int rootX=find(i);
                    int rootY=find(j);
                    if(rootX!=rootY){
                        union(rootX,rootY);
                        provinces--;
                    }
                }
            }
        }
        return provinces;
    }
}