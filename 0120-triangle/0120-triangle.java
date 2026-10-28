class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++){
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        return helper(triangle,dp,0,0);
    }
    public int helper(List<List<Integer>> triangle,int[][] dp,int i,int row){
        if(row==triangle.size()-1){
            return triangle.get(row).get(i);
        }

        if(dp[row][i]!=-Integer.MIN_VALUE) return dp[row][i];

        return dp[row][i]=triangle.get(row).get(i)+Math.min(helper(triangle,dp,i,row+1),helper(triangle,dp,i+1,row+1));
        

    }
}