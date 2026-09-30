/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[] nums,int st,int end){
        if(st>end) return null;
        int max=getMaxIndex(nums,st,end);
        TreeNode node=new TreeNode(nums[max]);
        node.left=helper(nums,st,max-1);
        node.right=helper(nums,max+1,end);
        return node;
    }
    public int getMaxIndex(int[] nums,int st,int end){
        int max=-1;
        int maxIndex=0;
        for(int i=st;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}