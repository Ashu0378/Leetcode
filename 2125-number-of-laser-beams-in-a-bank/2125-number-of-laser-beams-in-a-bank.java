class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int n=bank.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int cnt=count(bank[i]);
            if(cnt!=0) list.add(cnt);
        }
        int k=list.size();
        for(int i=0;i<k-1;i++){
            ans+=(list.get(i)*list.get(i+1));
        }
        return ans;
    }
    public int count(String s){
        int cnt=0;
        for(char ch:s.toCharArray()){
            if(ch=='1') cnt++;
        }
        return cnt;
    }
}