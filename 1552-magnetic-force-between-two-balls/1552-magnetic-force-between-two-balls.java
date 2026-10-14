class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high=position[position.length-1]-position[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(mid,position,m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean possible(int mid,int[] nums,int m){
        int count=1;
        int lastPossible=nums[0];
        for(int i=0;i<nums.length;i++){
            if((nums[i]-lastPossible)>=mid){
                count++;
                lastPossible=nums[i];
            }
            if(count>=m) return true;
        }
        return false;
    }
}