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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode p=root;
        int count=0;
        while(p!=null || !stack.isEmpty()){
         if(p!=null){
             stack.push(p);
             p=p.left;   
         } 
         else{
            p = stack.pop();
            count++;
            if(count==k){
                return p.val; 
            }
            p=p.right;
         }
     }
     
     return Integer.MIN_VALUE;
    }
}