class Solution {
    public String finalString(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='i'){
                String temp=sb.reverse().toString();
                sb.setLength(0);
                sb.append(temp);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}