class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(x,y)->Integer.compare(y[1],x[1]));
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize<=boxTypes[i][0]){
                return ans+(truckSize*boxTypes[i][1]);
            }
            else{
                ans+=(boxTypes[i][0]*boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
            }
        }
        return ans;
    }
}