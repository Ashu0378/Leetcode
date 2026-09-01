class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int unique=0;
        int max=0;
        int count=0;
        for(int i=0;i<fruits.length;i++){
            if(!map.containsKey(fruits[i]) || map.get(fruits[i])==0) unique++;
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            count++;
            while(unique>2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left])==0) unique--;
                left++;
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}