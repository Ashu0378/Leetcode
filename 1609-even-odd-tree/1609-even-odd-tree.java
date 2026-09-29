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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(q.size()>0){
            int size=q.size();
            int min=0;
            int max=Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode front=q.poll();
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
                if(level%2==0){
                    if(front.val<=min || front.val%2==0) return false;
                    min=front.val;
                }
                else{
                    if(front.val>=max || front.val%2!=0) return false;
                    max=front.val;
                }
            }
            level++;
        }
        return true;
    }

}