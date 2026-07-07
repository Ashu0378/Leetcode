class Solution {
    public boolean isValid(String word) {
        String vowel="aeiouAEIOU";
        String consonent="BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";
        boolean isVowel=false;
        boolean isConsonent=false;
        int count=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if((ch>='0' && ch<='9') || (ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                if(vowel.indexOf(ch)!=-1) isVowel=true;
                if(consonent.indexOf(ch)!=-1) isConsonent=true;
                count++;
            }
            else{
                return false;
            }
        }
        if(count>=3 && isVowel && isConsonent) return true;
        return false;
    }
}