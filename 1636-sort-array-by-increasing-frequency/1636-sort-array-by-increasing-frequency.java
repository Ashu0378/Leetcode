class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return Arrays.stream(nums).boxed().sorted((a, b) -> {
                    int freqA = map.get(a);
                    int freqB = map.get(b);
                    if (freqA != freqB) {
                        return Integer.compare(freqA, freqB);
                    }
                    return Integer.compare(b, a);
                }).mapToInt(Integer::intValue).toArray();
    }
}