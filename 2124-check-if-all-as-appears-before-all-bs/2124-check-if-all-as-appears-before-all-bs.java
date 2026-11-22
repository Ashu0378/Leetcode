class Solution {
    public boolean checkString(String s) {
        int i=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='b'){
                i=j;
                break;
            }
        }
        if(i==s.length()-1) return true;
        if(s.charAt(i)=='a') return true;
        for(int j=i;j<s.length();j++){
            if(s.charAt(j)=='a') return false;
        }
        return true;
    }
}