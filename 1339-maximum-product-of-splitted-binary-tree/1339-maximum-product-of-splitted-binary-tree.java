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
    long total=0;
    long max=0;
    public int maxProduct(TreeNode root) {
        total=getSum(root);
        helper(root);
        return (int)(max% 1_000_000_007);
    }
    public long getSum(TreeNode root){
        if(root==null) return 0;
        return root.val+getSum(root.left)+getSum(root.right);
    }
    public long helper(TreeNode root){
        if(root==null) return 0;
        long leftSum=helper(root.left);
        long rightSum=helper(root.right);
        max=Math.max(max,leftSum*(total-leftSum));
        max=Math.max(max,rightSum*(total-rightSum));

        return root.val+leftSum+rightSum;
    }

}