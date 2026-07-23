class Solution {
    public boolean judgeCircle(String moves) {
        int UD=0;
        int LR=0;
        for(char ch:moves.toCharArray()){
            // char ch=moves.charAt(i);
            if(ch=='U') UD--;
            else if(ch=='D') UD++;

            else if(ch=='L') LR--;
            else if(ch=='R') LR++;
        }
        return UD==0 && LR==0;
    }
}