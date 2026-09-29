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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return -1;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        int max=Integer.MIN_VALUE;
        int maxLevel=1;
        while(q.size()>0){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode front=q.poll();
                sum+=front.val;
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            if(sum>max){
                max=sum;
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;
    }
}