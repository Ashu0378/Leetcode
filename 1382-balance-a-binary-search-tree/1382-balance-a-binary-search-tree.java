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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        getSorted(list,root);
        return balancedBST(list,0,list.size()-1);
    }
    public void getSorted(List<Integer> l,TreeNode root){
        if(root==null) return;
        getSorted(l,root.left);
        l.add(root.val);
        getSorted(l,root.right);
    }
    public TreeNode balancedBST(List<Integer> l,int st,int end){
        if(st > end) return null;
        int mid=st+(end-st)/2;
        TreeNode node=new TreeNode(l.get(mid));
        node.left=balancedBST(l,st,mid-1);
        node.right=balancedBST(l,mid+1,end);
        return node;
    }
}