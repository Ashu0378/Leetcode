class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<trust.length;i++){
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
            map.put(trust[i][0],map.getOrDefault(trust[i][0],0)-1);
        }
        for(int i=0;i<trust.length;i++){
            if(map.get(trust[i][1])==n-1) return trust[i][1];
        }
        return -1;
    }
}