class Solution {
    public int maxDistinct(String s) {
        int[] freq=new int[26];
        int unique=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']==1) unique++;
        }
        // int unique=0;
        // for(int i=0;i<26;i++){
        //     if(freq[i]>0) unique++;
        // }
        return unique;
    }
}