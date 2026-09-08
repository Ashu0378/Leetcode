class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int t=count('T',answerKey,k);
        int f=count('F',answerKey,k);
        return Math.max(t,f);
    }
    public int count(char ch,String ak,int k){
        int count=0;
        int left=0;
        int max=0;
        for(int i=0;i<ak.length();i++){
            if(ak.charAt(i)==ch){
                count++;
            }
            while(count>k){
                if(ak.charAt(left)==ch){
                    count--;
                }
                left++;
            }
            max=Math.max(max,i-left+1);

        }
        return max;
    }
}