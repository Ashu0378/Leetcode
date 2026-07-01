class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        String res="abcdefghigjklmnopqrstuvwxyz";

        for(int i=0;i<res.length();i++){
            char ch=res.charAt(i);
            if(!sentence.contains(ch+"")) return false;
        }
        return true;
    }
}