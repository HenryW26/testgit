package Tree;

public class CheckSymmetry {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return checkout(root.left,root.right);
    }
    public boolean checkout(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return (p.val==q.val)&&checkout(p.left,q.right)&&checkout(p.right,q.left);
    }
}
