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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int child=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                int parent=0;
                TreeNode top=q.remove();
                if(top.left!=null){
                    if(top.left.val==x || top.left.val==y){
                        child++;
                        parent++;
                    }
                    q.add(top.left);
                }
                if(top.right!=null){
                    if(top.right.val==x || top.right.val==y){
                        child++;
                        parent++;
                    }
                    q.add(top.right);
                }
                if(parent==2) return false;
            }
            if(child==2) return true;
        }
        return false;
    }
}