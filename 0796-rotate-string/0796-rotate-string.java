class Solution {
    public boolean rotateString(String s, String goal) {
        s+=s;
        if(s.contains(goal)) return true;
        return false;        
        
    }
}