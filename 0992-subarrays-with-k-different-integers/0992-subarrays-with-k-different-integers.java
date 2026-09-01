class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // ham exact k unique length ke subsets find nahi kr skte normal slid window se.
        // thats why we are using variable length slid window here
        // approach find [atmost k unique subset - atmost k-1 unique subset]

        int kSub=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int unique=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]) || map.get(nums[i])==0) unique++;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(unique>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0) unique--;
                left++;
            }
            kSub+=(i-left+1);
        }

        HashMap<Integer,Integer> map2=new HashMap<>();
        left=0;
        unique=0;
        int kSub2=0;
        for(int i=0;i<nums.length;i++){
            if(!map2.containsKey(nums[i]) || map2.get(nums[i])==0) unique++;
            map2.put(nums[i],map2.getOrDefault(nums[i],0)+1);
            while(unique>k-1){
                map2.put(nums[left],map2.getOrDefault(nums[left],0)-1);
                if(map2.get(nums[left])==0) unique--;
                left++;
            }
            kSub2+=(i-left+1);
        }
        return kSub-kSub2;
    }
}