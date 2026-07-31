class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public void helper(List<List<Integer>> ans,List<Integer> list,int[] arr,int st){
        ans.add(new ArrayList<>(list));
        for(int i=st;i<arr.length;i++){
            list.add(arr[i]);
            helper(ans,list,arr,i+1);
            list.remove(list.size()-1);
        }
    }
}