class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char a=ch[i];
            char b=ch[j];
            if(!((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z'))){
                i++;
                continue;
            }
            if(!((b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z'))){
                j--;
                continue;
            }
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}