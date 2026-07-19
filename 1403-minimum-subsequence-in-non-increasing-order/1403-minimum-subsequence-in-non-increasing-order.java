class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int temp=0;
        int j=nums.length-1;
        while(temp<=total){
            temp+=nums[j];
            total-=nums[j];
            ans.add(nums[j]);
            j--;
        }
        return ans;
    }
}