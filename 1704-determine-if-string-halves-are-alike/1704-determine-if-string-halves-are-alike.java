class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);

        String vowels="aeiouAEIOU";
        int first=0;
        int second=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(vowels.indexOf(ch) != -1) first++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(vowels.indexOf(ch) != -1) second++;
        }

        if(first==second) return true;
        return false; 
    }
}