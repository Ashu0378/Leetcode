class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum =n*(n+1)/2;
        int tempSum=0;
        for(int i=1;i<=n;i++){
            if(i%m==0) tempSum+=i;
        }
        return totalSum-2*tempSum;
        
    }
}