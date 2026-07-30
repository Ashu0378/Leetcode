class Solution {
    public int convertTime(String current, String correct) {
        int h1=Integer.parseInt(current.substring(0,2));
        int m1=Integer.parseInt(current.substring(3,5));
        int totalcurr=(h1*60)+m1;

        int h2=Integer.parseInt(correct.substring(0,2));
        int m2=Integer.parseInt(correct.substring(3,5));
        int totalcorr=(h2*60)+m2;

        int diff=totalcorr-totalcurr;
        int ans=0;
        ans += diff / 60;
        diff %= 60;
        ans += diff / 15;
        diff %= 15;
        ans += diff / 5;
        diff %= 5;
        ans += diff;
        
        return ans;
    }
}