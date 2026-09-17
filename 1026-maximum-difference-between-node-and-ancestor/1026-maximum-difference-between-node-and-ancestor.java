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
    int sum=0;
    public int maxAncestorDiff(TreeNode root) {
        dfs(root,new ArrayList<>());
        return sum;
    }
    public void dfs(TreeNode node,List<Integer> parents){
        if(node==null) return;
        if(parents.size()>0){
            for(int i=0;i<parents.size();i++){
                sum=Math.max(sum,Math.abs(parents.get(i)-node.val));
            }
        }
        parents.add(node.val);
        dfs(node.left,parents);
        dfs(node.right,parents);
        parents.remove(parents.size()-1);
    }
}