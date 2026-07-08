class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] flag=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(isFind(board,i,j,flag,word,0)) return true;
                }
            }
        }
        return false;
    }
    public boolean isFind(char[][] board,int i,int j,int[][] flag,String word,int index){
        if (index == word.length()) {
            return true;
        }
        if(i>=board.length || i<0 || j>=board[0].length || j<0 || board[i][j]!=word.charAt(index) || flag[i][j]==1){
            return false;
        }
        flag[i][j]=1;
        if (isFind(board,i+1,j,flag,word,index+1) || isFind(board,i-1,j,flag,word,index+1) || isFind(board,i,j+1,flag,word,index+1) || isFind(board,i,j-1,flag,word,index+1)) return true;

        flag[i][j]=0;
        return false;
    }
}