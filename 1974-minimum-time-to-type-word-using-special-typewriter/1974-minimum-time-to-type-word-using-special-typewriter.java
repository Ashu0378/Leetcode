class Solution {
    public int minTimeToType(String word) {
        int ans=0;
        char prev='a';
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int min=Math.min(Math.abs(ch-prev),26-Math.abs(ch-prev));
            ans+=min+1;
            prev=ch;
        }
        return ans;
    }
}