class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isIsomorphic(words[i],pattern)){
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean isIsomorphic(String s, String t) {
        if (s.length()==0 && t.length()==0 && s.length() != t.length()) return false;

        int[] charS=new int[256];
        int[] charT=new int[256];

        for(int i=0;i<s.length();i++){
            char s_=s.charAt(i);
            char t_=t.charAt(i);

            if(charS[s_]!=charT[t_]){
                return false;
            }
            charS[s_]=i+1;
            charT[t_]=i+1;

        }
        return true;
    }
}