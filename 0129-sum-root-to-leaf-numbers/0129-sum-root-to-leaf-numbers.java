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
    public static int ans=0;
    public int sumNumbers(TreeNode root) {
        ans=0;
        StringBuilder currPath=new StringBuilder();

        helper(root,currPath);
        return ans;
    }
    public void helper(TreeNode root,StringBuilder currPath){
        if(root==null) return;
        currPath.append(root.val);
        if(root.left==null && root.right==null){
            ans+=Integer.parseInt(currPath.toString());
        }
        else{
            helper(root.left,currPath);
            helper(root.right,currPath);
        }
        currPath.deleteCharAt(currPath.length() - 1);

    }
}