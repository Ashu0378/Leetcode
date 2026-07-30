class Solution {
    public int minimumOperations(int[] nums) {
        int freq[] = new int[101];
        int n = nums.length;
        int countUnique = 0;
        for(int i=0;i<n;i++){
            if(nums[i] != 0)    
                freq[nums[i]]++;
        }
        for(int i=0;i<=100;i++){
            if(freq[i] != 0)    
                countUnique++;
        }
        return countUnique;
    }
}