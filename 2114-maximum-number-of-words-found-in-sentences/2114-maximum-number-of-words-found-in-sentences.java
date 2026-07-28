class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String s:sentences){
            int temp=0;
            for(char ch:s.toCharArray()){
                if(ch==' ') temp++;
            }
            count=Math.max(count,temp);
        }
        return count+1;
    }
}