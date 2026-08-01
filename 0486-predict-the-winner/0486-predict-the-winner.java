class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        if(n%2==0) return true;
        int[] temp=new int[n];
        for(int i=n-2;i>=0;i--){
            temp[i]=nums[i];
            for(int j=i+1;j<n;j++){
                temp[j]=Math.max(nums[i]-temp[j],nums[j]-temp[j-1]);
            }
        }
        return temp[n-1]>=0;
    }
}