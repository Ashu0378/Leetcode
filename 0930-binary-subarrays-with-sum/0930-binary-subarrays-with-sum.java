class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int left=0;
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(i-left+1);
        }
        left=0;
        sum=0;
        if(goal<1) return count;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>goal-1){
                sum-=nums[left];
                left++;
            }
            count2+=(i-left+1);
        }
        return count-count2;
    }
}