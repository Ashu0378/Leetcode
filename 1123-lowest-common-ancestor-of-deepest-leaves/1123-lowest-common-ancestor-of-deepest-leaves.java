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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int max=depth(root);
        return dfs(root,max,0);
    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(depth(root.left),depth(root.right));
    }
    public TreeNode dfs(TreeNode root,int depth,int curr){
        if(root==null) return null;
        if(curr==depth-1) return root;
        TreeNode left=dfs(root.left,depth,curr+1);
        TreeNode right=dfs(root.right,depth,curr+1);

        if(left!=null && right!=null) return root;
        if(left!=null) return left;
        return right;
    }
}