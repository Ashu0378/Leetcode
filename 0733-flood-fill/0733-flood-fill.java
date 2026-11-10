class Solution {
    int prev;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        prev=image[sr][sc];
        if(prev==color) return image;
        helper(image,sr,sc,color);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int color){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=prev) return;
        image[sr][sc]=color;

        helper(image,sr+1,sc,color);
        helper(image,sr-1,sc,color);
        helper(image,sr,sc+1,color);
        helper(image,sr,sc-1,color);
    }
}