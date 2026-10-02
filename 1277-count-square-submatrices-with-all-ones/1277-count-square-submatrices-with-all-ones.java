class Solution {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1<0 || j-1<0 || matrix[i][j]==0) continue;
                int a=matrix[i-1][j-1];
                int b=matrix[i-1][j];
                int c=matrix[i][j-1];
                matrix[i][j]+=Math.min(a,Math.min(b,c));
            }
        }
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(matrix[i][j]);
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}