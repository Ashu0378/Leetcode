class Solution {
    public void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j]=board[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isLive(temp,i,j)){
                    board[i][j]=1;
                }
                else board[i][j]=0;
            }
        }
    }
    public boolean isLive(int[][] temp,int i,int j){
        int m=temp.length;
        int n=temp[i].length;
            int count=0;
            if(i>0 && temp[i-1][j]==1){
                count++;
            }
            if(i>0 && j>0 && temp[i-1][j-1]==1){
                count++;
            }
            if(i>0 && j+1<n && temp[i-1][j+1]==1){
                count++;
            }
            if(j>0 && temp[i][j-1]==1){
                count++;
            }
            if(j+1<n && temp[i][j+1]==1){
                count++;
            }
            if(i+1<m && temp[i+1][j]==1){
                count++;
            }
            if(i+1<m && j>0 && temp[i+1][j-1]==1){
                count++;
            }
            if(i+1<m && j+1<n && temp[i+1][j+1]==1){
                count++;
            }

            if(temp[i][j]==1 && (count==2 || count==3)) return true;
            if(temp[i][j]==0 && count==3) return true;
            return false;

    }
}