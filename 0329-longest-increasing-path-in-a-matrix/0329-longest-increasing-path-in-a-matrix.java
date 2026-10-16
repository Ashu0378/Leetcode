class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dfs(matrix,-1,i,j,dp);
            }
        }
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
    public int dfs(int[][] matrix,int prev,int row,int col,int[][] dp){
        if(row<0 || row>=matrix.length || col<0 || col>=matrix[0].length || matrix[row][col]<=prev) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        int res=1;
        res=Math.max(res,1+dfs(matrix,matrix[row][col],row+1,col,dp));
        res=Math.max(res,1+dfs(matrix,matrix[row][col],row-1,col,dp));
        res=Math.max(res,1+dfs(matrix,matrix[row][col],row,col+1,dp));
        res=Math.max(res,1+dfs(matrix,matrix[row][col],row,col-1,dp));
        dp[row][col]=res;
        return res;

    }
}