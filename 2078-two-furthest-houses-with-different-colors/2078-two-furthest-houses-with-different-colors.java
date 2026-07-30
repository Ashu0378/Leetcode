class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                break;
            }
            else{
                j--;
            }
        }
        int leftMax=Math.abs(i-j);
        i=0;
        j=colors.length-1;
        while(i<j){
            if(colors[i]!=colors[j]){
                break;
            }
            else{
                i++;
            }
        }
        int rightMax=Math.abs(i-j);
        return Math.max(leftMax,rightMax);

    }
}