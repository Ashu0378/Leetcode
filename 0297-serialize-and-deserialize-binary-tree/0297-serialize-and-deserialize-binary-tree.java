/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            TreeNode front=q.poll();
            if(sb.length()>0) sb.append(",");
            if(front==null){
                sb.append("n");
            }
            else{
                sb.append(front.val);
                q.add(front.left);
                q.add(front.right);
            }

        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] s=data.split(",");
        TreeNode node=new TreeNode(Integer.parseInt(s[0]));
        Queue<TreeNode> q=new LinkedList<>();
        q.add(node);
        int idx=1;
        while(!q.isEmpty() && idx<s.length){
            TreeNode front=q.poll();
            if(idx<s.length && !s[idx].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(s[idx]));
                front.left=left;
                q.add(left);
            }
            idx++;
            if(idx<s.length && !s[idx].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(s[idx]));
                front.right=right;
                q.add(right);
            }
            idx++;
        }
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));