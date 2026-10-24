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
    int ans;
    public int pathSum(TreeNode root, int targetSum) {
        //if(targetSum==0) return 0;
        ans=0;
        dfs(root,targetSum);
        return ans;
    }
    public void dfs(TreeNode root,int k){
        if(root==null) return;
        
        helper(root,k,0);
        dfs(root.left,k);
        dfs(root.right,k);
    }
    public void helper(TreeNode root,int k,long sum){
        if(root==null) return;
        sum+=root.val;
        if(k==sum) ans++;

        helper(root.left,k,sum);
        helper(root.right,k,sum);
    }
}