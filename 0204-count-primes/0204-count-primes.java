class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int[] isPrime=new int[n+1];
        isPrime[0]=1;
        isPrime[1]=1;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==0){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=1;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==0) count++;
        }
        return count;
    }
}