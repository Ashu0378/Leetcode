class Solution {
    public int subsetXORSum(int[] nums) {
        int bits = 0;
        for (int num : nums) {
            bits |= num;
        }
        return bits<<(nums.length-1);
    }
}