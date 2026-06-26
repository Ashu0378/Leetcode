class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=0;
        int zeroCount=0;
        int nonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
                continue;
            }
            if(nums[i]!=0) nonZero++;
            product=(product==0)?(product+1)*nums[i]:product*nums[i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(zeroCount==0){
                    ans[i]=product/nums[i];
                }

                else{
                    ans[i]=0;
                }
            }
            else{
                if(zeroCount>1) ans[i]=0;
                else ans[i]=product;
            }
        }
        return ans;
    }
}