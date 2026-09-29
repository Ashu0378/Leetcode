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
    public int minDiffInBST(TreeNode root) {
        List<Integer> data=new ArrayList<>();
        helper(root,data);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<data.size();i++){
            min=Math.min(min,data.get(i)-data.get(i-1));
        }
        return min;
    }
    public void helper(TreeNode root,List<Integer> list){
        if(root==null) return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}