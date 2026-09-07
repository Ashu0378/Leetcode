class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> smaller=new ArrayList<>();
        ArrayList<Integer> higher=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }
            else if(nums[i]>pivot){
                higher.add(nums[i]);
            }
            else{
                count++;
            }
        }
        int index=0;
        int i=0;
        while(i<smaller.size()){
            nums[index++]=smaller.get(i);
            i++;
        }
        while(count>0){
            nums[index++]=pivot;
            count--;
        }
        i=0;
        while(i<higher.size()){
            nums[index++]=higher.get(i);
            i++;
        }
        return nums;
    }
}