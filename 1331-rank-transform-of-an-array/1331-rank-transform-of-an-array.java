class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] temp=arr.clone();
        Arrays.sort(temp);
        int counter=1;
        for(int i=0;i<arr.length;i++){
            if(i!=0 && temp[i]==temp[i-1]) continue;
            map.put(temp[i],counter);
            counter++;
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }
        return ans;
    }
}