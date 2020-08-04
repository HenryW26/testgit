package Tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxDepth {
    //BFS method
//    int level=0;
//    public int maxDepth(TreeNode root) {
//        Deque<TreeNode> queue = new ArrayDeque<>();
//        if(root!=null){
//            queue.addLast(root);
//        }
//        while(!queue.isEmpty()){
//            int n = queue.size();
//            for(int i=0;i<n;i++) {
//                TreeNode node = queue.pollFirst();
//                if (node.left != null) {
//                    queue.addLast(node.left);
//                }
//                if (node.right != null) {
//                    queue.addLast(node.right);
//                }
//            }
//            level++;
//        }
//        return level;
//    }
    // Recursive method
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
