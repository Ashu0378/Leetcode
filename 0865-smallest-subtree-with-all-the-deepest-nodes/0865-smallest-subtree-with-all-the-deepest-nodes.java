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
    TreeNode ans;
    int max;
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        ans=null;
        max=-1;
        helper(root,0);
        return ans;
    }
    public int helper(TreeNode root,int height){
        if(root==null) return 0;
        int left=helper(root.left,height+1);
        int right=helper(root.right,height+1);
        if(left==right && (left+height)>=max){
            ans=root;
            max=left+height;
        }
        return 1+Math.max(left,right);
    }
}