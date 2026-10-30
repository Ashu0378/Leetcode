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
    List<List<TreeNode>> dp;
    public List<TreeNode> allPossibleFBT(int n) {
        dp = new ArrayList<>();
        for (int i = 0; i <= n; i++) dp.add(new ArrayList<>());
        return solve(n);
    }
    public List<TreeNode> solve(int n){
        if (n % 2 == 0) return new ArrayList<>();
        if(n==1){
            dp.set(1,new ArrayList(List.of(new TreeNode())));
        }
        if(dp.get(n).size()>0) return dp.get(n);
        List<TreeNode> ans = new ArrayList<>();
        for(int i=1;i<n;i+=2){
            List<TreeNode> left = solve(i);
            List<TreeNode> right = solve(n - 1 - i);
            for(TreeNode l:left){
                for(TreeNode r:right){
                    TreeNode root=new TreeNode();
                    root.left=l;
                    root.right=r;
                    ans.add(root);
                }
            }
        }
        dp.set(n,ans);
        return ans;
    }
}