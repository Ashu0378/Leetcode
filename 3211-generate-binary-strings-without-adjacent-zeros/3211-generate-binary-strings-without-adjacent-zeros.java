class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,ans,"");
        return ans;
    }
    public void helper(int n,List<String> ans,String temp){
        if(temp.length()==n){
            ans.add(temp);
            return;
        }
        if(temp.isEmpty() || temp.charAt(temp.length()-1)=='1'){
            helper(n,ans,temp+"0");
        }
        helper(n,ans,temp+"1");
    }
}