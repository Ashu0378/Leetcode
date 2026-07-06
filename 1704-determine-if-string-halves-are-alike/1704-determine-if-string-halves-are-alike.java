class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2);

        String vowels="aeiouAEIOU";
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(vowels.indexOf(s1.charAt(i)) != -1)
                count++;
            if(vowels.indexOf(s2.charAt(i)) != -1)
                count--;
        }
        

        if(count==0) return true;
        return false; 
    }
}