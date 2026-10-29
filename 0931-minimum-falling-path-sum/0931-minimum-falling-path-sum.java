class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=matrix[i][j]+dp[i-1][j];
                int topLeft=1000000001;
                int topRight=100000001;
                if(j-1>=0){
                    topLeft=matrix[i][j]+dp[i-1][j-1];
                }
                if(j+1<matrix[0].length){
                    topRight=matrix[i][j]+dp[i-1][j+1];
                }
                dp[i][j]=Math.min(up,Math.min(topLeft,topRight));
            }
        }
        int min=dp[m-1][0];
        for(int i=1;i<n;i++){
            if(min>dp[m-1][i]){
                min=dp[m-1][i];
            }
        }
        return min;
    }
}