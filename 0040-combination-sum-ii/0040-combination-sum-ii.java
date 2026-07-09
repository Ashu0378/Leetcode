class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }
    public void helper(int index,int[] arr,int k,List<List<Integer>> ans,List<Integer> temp){
        //if(k<0) return;
        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i<arr.length;i++){
                if (i > index && arr[i] == arr[i - 1]) continue;
                if (arr[i] > k) break;

                temp.add(arr[i]);
                helper(i+1,arr,k-arr[i],ans,temp);
                temp.remove(temp.size()-1);
            
        }
    }
}