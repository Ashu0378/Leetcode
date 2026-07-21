class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        if(n==0) return ans;

        int rowS=0;
        int rowE=n-1;
        int colS=0;
        int colE=n-1;
        int counter=1;
        while(colS<=colE && rowS<=rowE){
            for(int i=colS;i<=colE;i++){
                ans[rowS][i]=counter++;
            }
            rowS++;
            for(int i=rowS;i<=rowE;i++){
                ans[i][colE]=counter++;
            }
            colE--;
            for(int i=colE;i>=colS;i--){
                ans[rowE][i]=counter++;
            }
            rowE--;
            for(int i=rowE;i>=rowS;i--){
                ans[i][colS]=counter++;
            }
            colS++;
        }
        return ans;
    }
}