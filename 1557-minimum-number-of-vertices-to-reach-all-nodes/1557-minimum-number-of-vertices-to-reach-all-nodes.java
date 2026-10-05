class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<edges.size();i++){
            arr[edges.get(i).get(1)]=edges.get(i).get(0);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                ans.add(i);
            }
        }
        return ans;
    }
}