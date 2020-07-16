package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
        TreeNode() { }
    }

//     用数组建立二叉排序树
    public static TreeNode bulidBST(int[] A) {
        TreeNode root = new TreeNode(A[0]);
        for (int i=1; i<A.length; i++) {
            createBST(root, A[i]);
        }
        return root;
    }

     private static void createBST(TreeNode node,int val){
        if(val<node.val){
            if(node.left==null){
                node.left = new TreeNode(val);
            }
            else{
                createBST(node.left,val);
            }
        }
        else {
            if(node.right==null){
                node.right = new TreeNode(val);
            }
            else{
                createBST(node.right,val);
            }
        }
     }


    // 层序遍历打印二叉树
    public static void levelOrderPrintBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root==null)
            return;
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node==null)
                continue;
            else
                System.out.println(node.val);
            queue.offer(node.left);
            queue.offer(node.right);
        }
    }

    public static void main(String[] args) {
        levelOrderPrintBST(bulidBST(new int[]{3,1,2,5,7}));
    }
}
