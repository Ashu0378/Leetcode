class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int n=nums.length;
        int left=0;
        int i=0;
        while(i<n){
            if(i<n-1 && nums[i+1]==nums[i]+1){
                i++;
                continue;
            }
            else if(left==i){
                ans.add(nums[left]+"");
                left=i+1;
            }
            else{
                ans.add(nums[left]+"->"+nums[i]);
                left=i+1;
            }
            i++;
        }
        return ans;
    }
}