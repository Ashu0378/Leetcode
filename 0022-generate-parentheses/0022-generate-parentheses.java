class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        dfs(0,0,"",n,ans);
        return ans;
    }
    private void dfs(int i,int j,String s,int n,List<String> res){
        if(i==j && i+j==2*n){
            res.add(s);
        }

        if(i<n){
            dfs(i+1,j,s+"(",n,res);
        }
        if(j<i){
            dfs(i,j+1,s+")",n,res);
        }
    }
}