class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfDivide(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean selfDivide(int num){
        int k=num;
        while(k>0){
            int x=k%10;
            if(x==0 || num % x !=0) return false;
            k=k/10;
        }
        return true;
    }
}