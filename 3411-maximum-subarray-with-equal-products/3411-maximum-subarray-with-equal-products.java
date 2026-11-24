class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            long prod=nums[i];
            long lcm=nums[i];
            long gcd=nums[i];
            for(int j=i+1;j<n;j++){
                prod*=nums[j];
                gcd=GCD(gcd,nums[j]);
                lcm=lcm/GCD(lcm,nums[j])*nums[j];

                if(prod>(gcd*lcm)) break;
                if(prod==(gcd*lcm)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;


    }
    public long GCD(long a,long b){
        if(b==0){
            return Math.abs(a);
        }
        return GCD(b,a%b);
    }
}