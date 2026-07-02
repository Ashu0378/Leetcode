class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            int val=indices[i];
            char c=s.charAt(i);
            ch[val]=c;
        }
        String str1 = new String(ch); 
        return str1;
    }
}