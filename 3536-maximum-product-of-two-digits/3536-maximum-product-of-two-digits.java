class Solution {
    public int maxProduct(int n) {
        int max=0;
        int secondMax=0;
        while(n>0){
            int temp=n%10;
            if(temp>max){
                secondMax=max;
                max=temp;
            }
            else if(temp>secondMax){
                secondMax=temp;
            }
            n/=10;
        }
        return max*secondMax;
    }
}