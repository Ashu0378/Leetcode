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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy=new TreeNode(0);
        helper(root,dummy);
        return dummy.right;
    }
    public TreeNode helper(TreeNode root,TreeNode curr){
        if(root==null) return curr;
        curr=helper(root.left,curr);
        curr.right=root;
        root.left=null;
        curr=root;
        return helper(root.right,curr);
    }
}