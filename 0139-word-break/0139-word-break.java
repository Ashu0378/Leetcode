class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        HashSet<Integer> failed = new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        return helper(s,0,set,failed);
    }
    public boolean helper(String s,int start,HashSet<String> set,HashSet<Integer> failed){
        if(start==s.length()) return true;
        if (failed.contains(start)) {
            return false;
        }
        for(int end=start+1;end<=s.length();end++){
            String temp=s.substring(start,end);
            if(set.contains(temp)){
                if(helper(s,end,set,failed)){
                    return true;
                }
            }
        }
        failed.add(start);
        return false;
    }

}