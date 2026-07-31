class Solution {
    public int mirrorDistance(int n) {
        int reverse=0;
        int m=n;
        while(n>0){
            int temp=n%10;
            reverse=(reverse*10)+temp;
            n/=10;
        }
        return Math.abs(m-reverse);
    }
}