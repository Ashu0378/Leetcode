class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length()-1;
        if(sentence.charAt(0)!=sentence.charAt(n)) return false;
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length-1;i++){
            char curr=s[i].charAt(s[i].length()-1);
            char next=s[i+1].charAt(0);
            if(curr!=next) return false;
        }
        return true;
    }
}