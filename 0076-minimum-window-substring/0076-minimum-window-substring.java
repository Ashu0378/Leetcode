class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        int[] freq=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }

        int min=Integer.MAX_VALUE;     
        int left=0;
        int count=t.length();
        String ans="";

        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)]-- > 0){
                count--;
            }
            while(count==0){
                if(i-left<min){
                    ans=s.substring(left,i+1);
                    min=i-left;
                }
                if(freq[s.charAt(left)]++ == 0){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}