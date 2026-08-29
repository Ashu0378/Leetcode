class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=1;
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[j]-nums[i]>k){
                ans++;
                i=j;
            }
            j++;
        }
        return ans;
    }
}