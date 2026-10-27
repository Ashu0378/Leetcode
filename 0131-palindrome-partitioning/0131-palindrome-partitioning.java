class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        helper(0,s,ans,temp);
        return ans;
    }
    public void helper(int index,String s,List<List<String>> ans,List<String> temp){
        if(index==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                helper(i+1,s,ans,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}