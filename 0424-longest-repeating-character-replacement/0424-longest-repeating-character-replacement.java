class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq=new int[26];
        int start=0;
        int res=0;
        for(int i=0;i<n;i++){
            int maxFreq=0;
            freq[s.charAt(i)-'A']++;
            for(int j=0;j<26;j++){
                maxFreq=Math.max(maxFreq,freq[j]);
            }
            while(start<=i && (i-start+1)-maxFreq>k){
                freq[s.charAt(start)-'A']--;
                start++;
                maxFreq=0;
                for(int j=0;j<26;j++){
                    maxFreq=Math.max(maxFreq,freq[j]);
                }
            }
            res=Math.max(res,i-start+1);
        }
        return res;
    }
}