class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int j=0;
        int k=piles.length-2;

        int ans=0;
        while(j<k){
            ans+=piles[k];
            j++;
            k-=2;
        }
        return ans;
    }
}