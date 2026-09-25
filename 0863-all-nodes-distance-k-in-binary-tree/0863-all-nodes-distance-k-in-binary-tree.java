/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode,TreeNode> parent=new HashMap<>();
    Set<TreeNode> visited=new HashSet<>();
    List<Integer> ans=new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        getParent(root);
        helper(target,k,0);
        return ans;
    }
    public void getParent(TreeNode root){
        if(root.left!=null){
            parent.put(root.left,root);
            getParent(root.left);
        }
        if(root.right!=null){
            parent.put(root.right,root);
            getParent(root.right);
        }
    }
    public void helper(TreeNode node,int k,int distance){
        if(node==null || visited.contains(node)) return;
        visited.add(node);
        if(distance==k){
            ans.add(node.val);
            return;
        }

        if(node.left!=null){
            helper(node.left,k,distance+1);
        }
        if(node.right!=null){
            helper(node.right,k,distance+1);
        }
        if(parent.get(node)!=null){
            helper(parent.get(node),k,distance+1);
        }
    }

}