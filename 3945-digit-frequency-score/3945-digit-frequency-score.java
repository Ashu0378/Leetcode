class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        while(n>0){
            int val=n%10;
            map.put(val,map.getOrDefault(val,0)+1);
            n/=10;
        }
        int ans=0;
        for(int i=0;i<=9;i++){
            if(map.containsKey(i)) ans+=(i*map.get(i));
        }
        return ans;
    }
}