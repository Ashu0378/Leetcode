class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1) return 1;
        int max=0;
        int temp=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
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