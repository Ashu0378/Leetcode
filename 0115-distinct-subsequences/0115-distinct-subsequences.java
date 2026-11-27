class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int m=s.length();
        int n=t.length();
        dp=new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(s,t,0,0);
    }
    public int helper(String s,String t,int i,int j){
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            int take=helper(s,t,i+1,j+1);
            int skip=helper(s,t,i+1,j);
            return dp[i][j]=take+skip;
        }
        return dp[i][j]=helper(s,t,i+1,j);
    }
}