class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        String first = "qwertyuiop";
        String second ="asdfghjkl";
        String third="zxcvbnm";
        for(String s:words){
            if(isInRow(s,first) || isInRow(s,second) || isInRow(s,third)){
                ans.add(s);
            }
        }
        return ans.toArray(new String[0]);
    }
    public boolean isInRow(String s,String row){
        for(char ch:s.toCharArray()){
            if(row.indexOf(Character.toLowerCase(ch))==-1){
                return false;
            }
        }
        return true;
    }
}