package Recursive;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root,int sum){
        if(root == null){
            return false;
        }
        int nextVal=0;
        if(root.left!=null||root.right!=null) {
            nextVal = sum - root.val;
        }
        if(sum == root.val&&root.left==null&&root.right==null){
            return true;
        }
        return (hasPathSum(root.left,nextVal)||hasPathSum(root.right,nextVal));
    }
}
