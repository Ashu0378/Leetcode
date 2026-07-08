class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(candidates,target,temp,ans,0);
        return ans;
    }
    public void helper(int[] arr,int k,List<Integer> temp,List<List<Integer>> ans,int index){
        if(k<0) return;
        else if(k==0) ans.add(new ArrayList<>(temp));
        else{
            for(int i=index;i<arr.length;i++){
                temp.add(arr[i]);
                helper(arr,k-arr[i],temp,ans,i);
                temp.remove(temp.size()-1);
            }
        }
    }
}