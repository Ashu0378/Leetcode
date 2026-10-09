class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<10;i++){
            helper(i,ans,n);
        }
        return ans;
    }
    public void helper(int num,List<Integer> ans,int n){
        if(num>n) return;
        ans.add(num);
        for(int j=0;j<10;j++){
            int k=num*10+j;
            if(k>n) return;
            helper(k,ans,n);
        }
        num++;
    }
}