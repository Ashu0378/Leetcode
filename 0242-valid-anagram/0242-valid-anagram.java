class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] charFrequency=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            char y=t.charAt(i);
            charFrequency[x-'a']++;
            charFrequency[y-'a']--;

        }
        for(int i=0;i<26;i++){
            if(charFrequency[i]!=0) return false;
        }
        return true;
    }
}