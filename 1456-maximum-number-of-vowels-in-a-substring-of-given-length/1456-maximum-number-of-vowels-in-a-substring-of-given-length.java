class Solution {
    public int maxVowels(String s, int k) {
        int max=0;
        int left=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            while(i-left+1>k){
                ch=s.charAt(left);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count--;
                }
                left++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}