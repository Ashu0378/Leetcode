class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int total=0;
        int i=1;
        while(n>0){
            if(n>8){
                total+=(8*i);
                n-=8;
            }
            else{
                total+=(n*i);
                n=0;
            }
            i++;
        }
        return total;

    }
}