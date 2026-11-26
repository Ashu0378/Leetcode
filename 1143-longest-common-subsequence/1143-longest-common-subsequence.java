class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,0,text1,text2);
    }
    public int helper(int i,int j,String s1,String s2){
        if(i>=s1.length() || j>=s2.length()) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            return 1+helper(i+1,j+1,s1,s2);
        }
        return dp[i][j]=Math.max(helper(i+1,j,s1,s2),helper(i,j+1,s1,s2));
    }
}