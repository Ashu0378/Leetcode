class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                neg[x++]=nums[i];
            }
            else{
                pos[y++]=nums[i];
            }
        }
        int i=0;
        x=0;
        y=0;
        while(i<n){
            nums[i]=pos[x++];
            nums[i+1]=neg[y++];
            i+=2;
        }
        return nums;
    }
}