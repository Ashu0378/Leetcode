class Solution {
    public int compress(char[] chars) {
        String str="";
        boolean flag=true;
        int count=0;

        for(int i=0;i<chars.length;i++){
            if(str.length()!=0 && chars[i]!=chars[i-1]){
                if(count!=1) str+=(count);
                count=0;
                flag=true;
            }
            if(flag){
                str+=chars[i];
                flag=false;
            }
            count++;
        }
        if(chars.length!=1 && count!=1) str+=count;
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            chars[i]=ch;
        }
        return str.length();
    }
}