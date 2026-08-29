class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> last=new HashMap<>();
        for(int i=0;i<s.length();i++){
            last.put(s.charAt(i),i);
        }
        List<Integer> ans=new ArrayList<>();
        int low=0;
        int high=0;
        for(int i=0;i<s.length();i++){
            high=Math.max(high,last.get(s.charAt(i)));
            if(i==high){
                ans.add(high-low+1);
                low=i+1;
            }
        }
        return ans;
    }
}