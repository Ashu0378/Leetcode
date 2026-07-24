class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=score[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length / 2; i++) {
            int holder = temp[i];
            temp[i] = temp[temp.length - 1 - i];
            temp[temp.length - 1 - i] = holder;
        }
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(i==0){
                map.put(temp[i],"Gold Medal");
            }
            else if(i==1){
                map.put(temp[i],"Silver Medal");
            }
            else if(i==2){
                map.put(temp[i],"Bronze Medal");
            }
            else{
                map.put(temp[i],i+1+"");
            }
        }
        String[] ans=new String[n];
        for(int i=0;i<n;i++){
            ans[i]=map.get(score[i]);
        }
        return ans;
    }
}