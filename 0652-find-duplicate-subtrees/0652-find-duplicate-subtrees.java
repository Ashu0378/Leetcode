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
    Map<String,Integer> map=new HashMap<>();
    List<TreeNode> ans=new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return ans;
    }
    public String helper(TreeNode node){
        if(node==null) return "N";
        String left=helper(node.left);
        String right=helper(node.right);
        String curr=node.val+"#"+left+"#"+right;

        map.put(curr,map.getOrDefault(curr,0)+1);
        if(map.get(curr)==2) ans.add(node);

        return curr;

    }
}