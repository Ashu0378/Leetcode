class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a=(long)need1*cost1;
        long b=(long)need2*cost2;
        long sep=a+b;

        long both=(long)Math.max(need1,need2)*costBoth;

        long min=Math.min(need1,need2);
        long overlap=min*(long)costBoth+(long)(need1-min)*cost1+(long)(need2-min)*cost2;

        return Math.min(sep,Math.min(both,overlap));

    }
}