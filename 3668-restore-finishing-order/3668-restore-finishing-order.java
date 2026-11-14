class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        for(int num:friends){
            map.add(num);
        }
        for(int val:order){
            if(map.contains(val)){
                ans.add(val);
            }
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}