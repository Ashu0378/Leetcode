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
    int count=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        if(avgSum(root)){
            count++;
        }
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return count;
        
    }
    public boolean avgSum(TreeNode root){
        int count=0;
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode front=q.poll();
            count++;
            sum+=front.val;
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        if(root.val==(sum/count)) return true;
        return false;
    }
}