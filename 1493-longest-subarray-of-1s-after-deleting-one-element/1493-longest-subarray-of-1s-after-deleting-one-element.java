class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int[] freq=new int[2];
        int left=0;
        int valid=1;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]==1){
            //     freq[i]++;
            // }
            // else{
            //     valid--;
            // }
            if(nums[i]==0) valid--;

            while(valid<0){
                if(nums[left]==0) valid++;
                left++;

            }
            max=Math.max(max,i-left);
        }
        return max;
    }
}