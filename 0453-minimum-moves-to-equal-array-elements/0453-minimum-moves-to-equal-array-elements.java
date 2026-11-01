class Solution {
    public int minMoves(int[] nums) {
        
        int low=nums[0];
        for(int num:nums){
            if(num<low){
                low=num;
            }
        }
        //int high=nums[nums.length-1];
        //if(low==high) return 0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i]-low;
        }
        return ans;
    }
}