class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        for (int i = 0; i < freq.length / 2; i++) {
            int temp = freq[i];
            freq[i] = freq[freq.length - 1 - i];
            freq[freq.length - 1 - i] = temp;
        }
        int ans=0;
        int temp;
        for(int i=0;i<freq.length;i++){
            if(i<8) temp=1;
            else if(i>=8 && i<16) temp=2;
            else if(i>=16 && i<24) temp=3;
            else temp=4;
            ans+=(freq[i]*temp);
        }
        return ans;
    }
}