package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        Deque<TreeNode> queNode = new ArrayDeque<>();
        Deque<Integer> queVal = new ArrayDeque<>();
        queNode.addLast(root);
        queVal.addLast(root.val);
        while(!queNode.isEmpty()){
            TreeNode node = queNode.pollFirst();
            int count = queVal.pollFirst();
            if(node.left!=null){
                queNode.addLast(node.left);
                queVal.addLast(count+node.left.val);
            }
            if(node.right!=null){
                queNode.addLast(node.right);
                queVal.addLast(count+node.right.val);
            }
            if(node.left==null && node.right==null){
                if(sum == count){
                    return true;
                }
            }
        }
        return false;
    }
}
