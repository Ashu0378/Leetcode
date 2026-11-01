class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int low=nums[0];
        int high=nums[nums.length-1];
        if(low==high) return 0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            ans+=(nums[i]-nums[0]);
        }
        return ans;
    }
}