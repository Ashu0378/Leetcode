class Solution {
    //public int min=Integer.MAX_VALUE;
    public int minSubArrayLen(int target, int[] nums) {
        int min=0;
        int left=1;
        int right=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(mid,nums,target)){
                right=mid-1;
                min=mid;
            }
            else{
                left=mid+1;
            }
        }
        return min;
    }
    public boolean possible(int mid,int[] nums,int target){
        int sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(i-left+1==mid){
                if(sum>=target) return true;
                sum-=nums[left];
                left++;
            }
        }
        return false;
    }
}