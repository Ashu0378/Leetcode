class Solution {
    public boolean canAliceWin(int n) {
        int x=10;
        boolean flag=true;
        while(n>=0){
            if(flag==true){
                if(n<x) return false;
                else{
                    n-=x;
                }
                x--;
                flag=false;
            }
            else{
                if(n<x) return true;
                else{
                    n-=x;
                }
                x--;
                flag=true;
            }
        }
        return true;
    }
}