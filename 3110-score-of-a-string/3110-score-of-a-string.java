class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            char curr=s.charAt(i);
            char next=s.charAt(i+1);
            ans+=Math.abs((int)(curr-next));
        }
        return ans;
    }
}