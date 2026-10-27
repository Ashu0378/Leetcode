class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(arr[i],'.');
        }
        String[] ans=new String[m];

        for(int i=1;i<m;i++){
            for(int j=0;j<n-1;j++){
                arr[i][j]='#';
            }
        }
        for(int i=0;i<m;i++){
            String temp="";
            for(int j=0;j<n;j++){
                temp+=arr[i][j];
            }
            ans[i]=temp;
        }
        return ans;
        

    }
}