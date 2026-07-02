class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        int left=0;
        int a=0;
        int b=0;
        int c=0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)=='a') a++;
            else if(s.charAt(right)=='b') b++;
            else c++;
            while(a>=1 && b>=1 && c>=1){
                if(s.charAt(left)=='a') a--;
                else if(s.charAt(left)=='b') b--;
                else c--;
                left++;
            }
            ans+=left;
        }

        return ans;
    }
}