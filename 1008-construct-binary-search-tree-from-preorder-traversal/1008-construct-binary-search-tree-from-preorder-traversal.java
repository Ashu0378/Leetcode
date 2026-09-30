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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length-1);
    }
    public TreeNode helper(int[] arr,int s,int e){
        if(s>e) return null;
        TreeNode node=new TreeNode(arr[s]);
        int count=s+1;
        while(count<=e && arr[count]<arr[s]){
            count++;
        }
        node.left=helper(arr,s+1,count-1);
        node.right=helper(arr,count,e);
        return node;

    }
}