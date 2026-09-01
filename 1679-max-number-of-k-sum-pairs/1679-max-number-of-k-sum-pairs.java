class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            long sum=nums[i]+nums[j];
            if(sum==(long)k){
                ans++;
                i++;
                j--;
            }
            else if(sum>(long)k){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}