class Solution {
    public int findGCD(int[] nums) {
        int small=Integer.MAX_VALUE;
        int large=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
            if(nums[i]<small){
                small=nums[i];
            }
        }
        int i=small;
        while(i>=1){
            if(small%i==0 && large%i==0){
                return i;
            }
            i--;
        }
        return 1;
    }
}