class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int neg=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') count++;
            else if(ch==')' && count>0) count--;
            else neg++;
        }
        return neg+count;
    }
}