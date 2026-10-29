class Solution {
    Map<String,Integer> map=new HashMap<>();
    public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;

        String temp=new String(""+m+","+n);
        if(map.containsKey(temp)) return map.get(temp);

        int upWays=uniquePaths(m-1,n);
        int leftWays=uniquePaths(m,n-1);
        map.put(temp,upWays+leftWays);

        return upWays+leftWays;
    }
}