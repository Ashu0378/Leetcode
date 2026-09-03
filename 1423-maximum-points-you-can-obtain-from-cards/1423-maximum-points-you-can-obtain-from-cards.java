class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int totalSum=0;
        for(int num:cardPoints){
            totalSum+=num;
        }
        int x=n-k;
        int left=0;
        int min=Integer.MAX_VALUE;
        int temp=0;
        for(int i=0;i<n;i++){
            temp+=cardPoints[i];
            while(i-left+1>x){
                temp-=cardPoints[left];
                left++;
            }
            if(i-left+1==x){
                min=Math.min(min,temp);
            }
        }
        return totalSum-min;
    }
}