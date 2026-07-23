class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int uS=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else{
                uS++;
            }
        }
        int m1=(l+uS-r);
        int m2=(r+uS-l);
        return Math.max(m1,m2);
    }
}