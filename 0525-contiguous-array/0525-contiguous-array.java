class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            sum+= (nums[i]==0)?-1:1;
            if(sum==0){
                curr=i+1;
            }
            else if(map.containsKey(sum)){
                curr=Math.max(curr,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return curr;
    }
}