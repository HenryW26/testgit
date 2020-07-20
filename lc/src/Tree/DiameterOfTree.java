package Tree;

public class DiameterOfTree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftdepth = depth(root.left);
        int rightdepth = depth(root.right);
        ans = Math.max(ans,leftdepth+rightdepth);
        return Math.max(leftdepth,rightdepth)+1;
    }
}
