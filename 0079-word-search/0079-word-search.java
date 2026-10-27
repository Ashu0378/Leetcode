class Solution {
    boolean res;
    public boolean exist(char[][] board, String word) {
        res=false;
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(!res && word.charAt(0)==board[i][j]){
                    helper(board,word,i,j,"",0,vis);
                    
                }
            }
        }
        return res;
    }
    public void helper(char[][] board,String word,int row,int col,String ans,int index,boolean[][] vis){
        if(row>=board.length || row<0 || col>=board[0].length || col<0 || index>=word.length() ||board[row][col]!=word.charAt(index) || vis[row][col]) return;
        vis[row][col]=true;
        ans+=word.charAt(index);
        if(ans.equals(word)){
            res=true;
            return;
        }
        helper(board,word,row+1,col,ans,index+1,vis);
        helper(board,word,row,col-1,ans,index+1,vis);
        helper(board,word,row,col+1,ans,index+1,vis);
        helper(board,word,row-1,col,ans,index+1,vis);
        vis[row][col]=false;
    }
}