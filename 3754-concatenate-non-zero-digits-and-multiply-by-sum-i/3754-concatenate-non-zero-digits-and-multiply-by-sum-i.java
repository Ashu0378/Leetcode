class Solution {
    public long sumAndMultiply(int n) {
        String str=String.valueOf(n);
        String newStr="";
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='0'){
                newStr+=ch;
                sum+=(ch-'0');
            }
        }
        if (newStr.isEmpty()) {
            return 0;
        }
        long temp=Long.parseLong(newStr);
        return temp*sum;

    }
}