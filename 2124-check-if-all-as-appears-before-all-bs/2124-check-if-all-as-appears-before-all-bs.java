class Solution {
    public boolean checkString(String s) {
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='b'){
                break;
            }
            j++;
        }
        for(int i=j;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'){
                return false;
            }
        }
        return true;
    }
}