class Solution {
    public int minOperations(int[] nums, int x) {
        int t=0;
        for(int num:nums){
            t+=num;
        }
        if(t<x) return -1;
        long target=t-x;
        if(target==0) return nums.length;
        int left=0;
        int sum=0;
        int longest=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(left<=i && sum>target){
                sum-=nums[left++];
            }
            if(sum==target){
                longest=Math.max(longest,i-left+1);
            }
        }
        if(longest==-1) return -1;
        return nums.length-longest;
    }
}