class Solution {
    public int uniquePathsWithObstacles(int[][] obstacle) {
        int m=obstacle.length;
        int n=obstacle[0].length;
        int[][] temp=new int[m][n];
        if (obstacle[0][0]==1 || obstacle[m-1][n-1]==1) {
            return 0;
        }
        
        temp[0][0]=1;

        for (int i=1;i<m;i++){
            temp[i][0]=(obstacle[i][0]==0 && temp[i-1][0]==1)?1:0;
        }

        for(int j=1;j<n;j++){
            temp[0][j]=(obstacle[0][j]==0 && temp[0][j-1]==1)?1:0;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacle[i][j]==1){
                    temp[i][j]=0;
                }
                else{
                    temp[i][j]=(temp[i-1][j]+temp[i][j-1]);
                }
            }
        }
        return temp[m-1][n-1];
    }
}