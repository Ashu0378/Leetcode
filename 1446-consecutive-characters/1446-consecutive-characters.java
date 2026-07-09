class Solution {
    public int maxPower(String s) {
        if(s.length()==1) return 1;
        int max=0;
        int temp=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char prev=s.charAt(i-1);
            if(ch==prev){
                temp++;
                max=Math.max(temp,max);
            }
            else{
                temp=0;
            }
        }
        return max+1;
    }
}