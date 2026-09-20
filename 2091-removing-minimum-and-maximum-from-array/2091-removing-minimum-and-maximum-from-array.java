class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                max=nums[i];
                maxIndex=i;
            }
            if(nums[i]<=min){
                min=nums[i];
                minIndex=i;
            }
        }
        int x=Math.min(minIndex,maxIndex);
        int y=Math.max(minIndex,maxIndex);

        int max1=y+1;
        int max2=n-x;
        int max3=x+1+(n-y);

        return Math.min(max1,Math.min(max2,max3));
    }
}