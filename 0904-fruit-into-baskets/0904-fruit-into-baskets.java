class Solution {
    public int totalFruit(int[] fruits) {
        int[] freq=new int[fruits.length];
        int left=0;
        int unique=0;
        int max=0;
        for(int i=0;i<fruits.length;i++){
            if(freq[fruits[i]]==0) unique++;
            freq[fruits[i]]++;
            while(unique>2){
                freq[fruits[left]]--;
                if(freq[fruits[left]]==0) unique--;
                left++;

            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}