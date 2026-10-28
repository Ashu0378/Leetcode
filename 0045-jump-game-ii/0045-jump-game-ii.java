class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1) return 0;

        int ans=0;
        int currReach=0;
        int maxJump=0;

        for(int i=0;i<n;i++){
            maxJump=Math.max(maxJump,i+nums[i]);
            if(i==currReach){
                ans++;
                currReach=maxJump;
            }
            if(currReach>=n-1) break;
        }
        return ans;

    }
}