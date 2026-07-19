class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6'){
                sb.append('9');
                if(i+1<=s.length()){
                    sb.append(s.substring(i+1));
                }
                
                break;
            }
            else{
                sb.append(ch);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}