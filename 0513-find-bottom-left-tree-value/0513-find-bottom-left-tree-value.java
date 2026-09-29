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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return -1;
        Queue<TreeNode> q=new LinkedList<>();
        int left=-1;
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode front=q.poll();
                if(i==0) left=front.val;
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
        }
        return left;
    }
}