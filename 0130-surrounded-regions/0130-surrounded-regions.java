class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        int[][] track=new int[n][m];
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                dfs(0,i,n,m,track,board);
            }
            if(board[n-1][i]=='O'){
                dfs(n-1,i,n,m,track,board);
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                dfs(i,0,n,m,track,board);
            }
            if(board[i][m-1]=='O'){
                dfs(i,m-1,n,m,track,board);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(track[i][j]==0){
                    board[i][j]='X';
                }
                else{
                    board[i][j]='O';
                }
            }
        }

    }
    public void dfs(int i,int j,int n,int m,int[][] track,char[][] board){
        if(i<0 || i>=n || j<0 || j>=m || track[i][j]==1 || board[i][j]=='X') return;
        track[i][j]=1;
        dfs(i-1,j,n,m,track,board);
        dfs(i+1,j,n,m,track,board);
        dfs(i,j-1,n,m,track,board);
        dfs(i,j+1,n,m,track,board);
    }
}