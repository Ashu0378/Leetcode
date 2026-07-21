class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flag=true;

        for(int i=0;i<word.length();i++){
            if(i<word.length()-1 && (Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i+1)))){
                return false;
            }
            if(i>1 && Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i-1)) ){
                return false;
            }
        }
        return true;
    }
}