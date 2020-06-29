package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class PreOrderIterator {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return list;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode n =stack.pop();
            list.add(n.val);
            if(n.right!=null){
                stack.add(n.right);
            }
            if(n.left!=null){
                stack.add(n.left);
            }
        }
        return list;
    }
}
