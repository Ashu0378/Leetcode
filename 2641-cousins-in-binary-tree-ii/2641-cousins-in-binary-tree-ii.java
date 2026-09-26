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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> levelSum=new ArrayList<>();
        levelSum.add(root.val);
        while(q.size()>0){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode top=q.remove();
                if(top.left!=null){
                    q.add(top.left);
                    sum+=top.left.val;
                }
                if(top.right!=null){
                    q.add(top.right);
                    sum+=top.right.val;
                }
            }
            levelSum.add(sum);
        }


        q.add(root);
        int level=0;
        root.val=0;
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                int sum=0;
                if(top.left!=null){
                    sum+=top.left.val;
                    q.add(top.left);
                }
                if(top.right!=null){
                    sum+=top.right.val;
                    q.add(top.right);
                }

                if(top.left!=null){
                    top.left.val=levelSum.get(level+1)-sum;
                }
                if(top.right!=null){
                    top.right.val=levelSum.get(level+1)-sum;
                }   
                
            }
            level++;
        }

        return root;
    }
}