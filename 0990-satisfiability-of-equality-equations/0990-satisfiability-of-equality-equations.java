class Solution {
    int[] parent;
    int[] size;
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    public void connect(int x,int y){
        int rootX=find(x);
        int rootY=find(y);

        if(rootX==rootY) return;

        if(size[rootX]>=size[rootY]){
            parent[rootY]=rootX;
            size[rootX]+=size[rootY];
        }
        else{
            parent[rootX]=rootY;
            size[rootY]+=size[rootX];
        }
    }
    public boolean checkConnection(int a, int b){
        int roota = find(a);
        int rootb = find(b);
        if(roota == rootb) return true;
        return false;
    }
    public boolean equationsPossible(String[] equations) {
        int n=equations.length;
        parent=new int[26];
        size=new int[26];
        for(int i=0;i<26;i++){
            size[i]=1;
            parent[i]=i;
        }
        for(String s: equations){
            if(s.charAt(1) == '='){
                int a = s.charAt(0) - 'a';
                int b = s.charAt(3) - 'a';
                connect(a, b);
            }
        }
        
        for(String s : equations){
            if(s.charAt(1) == '!'){
                int a = s.charAt(0) - 'a';
                int b = s.charAt(3) - 'a';
                if(checkConnection(a, b)) return false;
            }
        }
        return true;

    }
}