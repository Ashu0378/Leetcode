class Solution {
    public int[] closestPrimes(int left, int right) {
        if(left == 1 && right == 1) return new int[]{-1,-1};
        int[] isPrime=new int[right+1];
        for(int i=2;i*i<=right;i++){
            if(isPrime[i]==0){
                for(int j=i*i;j<=right;j+=i){
                    isPrime[j]=1;
                }
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(2,left); i <= right; i++) {
            if (isPrime[i]==0) {
                primes.add(i);
            }
        }
        
        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }
        int minGap = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        
        for (int i = 1; i < primes.size(); i++) {
            int gap = primes.get(i) - primes.get(i - 1);
            if (gap < minGap) {
                minGap = gap;
                result[0] = primes.get(i - 1);
                result[1] = primes.get(i);
            }
        }
        
        return result;
    }
}