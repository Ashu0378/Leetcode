class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int counter=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-counter<=0){
                continue;
            }
            else{
                ans++;
                counter+=(nums[i]-counter);
            }
        }
        return ans;
    }
}