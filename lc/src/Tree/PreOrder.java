package Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(list,root);
        return  list;
    }

    public void helper(List<Integer> res, TreeNode root){
        if(root==null){
            return;
        }
        res.add(root.val);
        helper(res,root.left);
        helper(res,root.right);
    }
}