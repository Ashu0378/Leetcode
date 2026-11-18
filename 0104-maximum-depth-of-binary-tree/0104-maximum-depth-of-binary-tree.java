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
    int max;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        max=0;
        helper(root,1);
        return max;
    }
    public void helper(TreeNode root,int height){
        if(root==null) return;
        max=Math.max(max,height);
        helper(root.left,height+1);
        helper(root.right,height+1);
    }
}