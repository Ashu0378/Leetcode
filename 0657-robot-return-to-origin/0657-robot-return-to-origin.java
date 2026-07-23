class Solution {
    public boolean judgeCircle(String moves) {
        int UD=0;
        int LR=0;
        for(int i=0;i<moves.length();i++){
            char ch=moves.charAt(i);
            if(ch=='U') UD--;
            else if(ch=='D') UD++;

            if(ch=='L') LR--;
            else if(ch=='R') LR++;
        }

        if(UD==0 && LR==0){
            return true;
        }
        return false;
    }
}