class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int unique=1;
        for(int i=n-1;i>=0;i--){
            if(i>0 && nums[i]>nums[i-1]){
                unique++;
                if(unique==3) return nums[i-1];
            }
        }
        return nums[n-1];
    }
}