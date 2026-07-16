class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            count+=negative(grid[i]);
        }
        return count;
    }
    public int negative(int[] row){
        int left=0;
        int right=row.length-1;
        int count=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(row[mid]>=0){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
        }
        return row.length-left;
    }
}