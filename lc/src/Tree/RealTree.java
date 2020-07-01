package Tree;

import java.util.ArrayList;
import java.util.List;
public class RealTree {
    private Object data;//存放当前节点的数据
    private RealTree lChild;//当前节点的左孩子
    private RealTree rChild;//当前节点的右孩纸
    private RealTree root;//这是根节点
    /**
     * 实现各个变量的get,set方法
     * @return
     */
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public RealTree getlChild() {
        return lChild;
    }
    public void setlChild(RealTree lChild) {
        this.lChild = lChild;
    }
    public RealTree getrChild() {
        return rChild;
    }
    public void setrChild(RealTree rChild) {
        this.rChild = rChild;
    }
    public RealTree getRoot() {
        return root;
    }
    public void setRoot(RealTree root) {
        this.root = root;
    }

    public RealTree(Object data){
        this.data=data;
    }
    public RealTree(){

    }

    public void created(Object data[]){//初始化二叉树,将传进来的值创建为二叉树
        List <RealTree>list=new ArrayList<RealTree>();//新建一个list集合，将数据变为各个节点
        for (Object tempdata :data) {
            list.add(new RealTree(tempdata));
        }
        root=list.get(0);//将第一个元素设置为根节点
        /**
         * 利用构建完全二叉树的方式构建
         */
        for(int i=0;i<list.size()/2;i++){
            if((i*2+1)<list.size()){
                list.get(i).setlChild(list.get(i*2+1));
            }
            if((i*2+2)<list.size()){
                list.get(i).setrChild(list.get(i*2+2));
            }
        }
    }

    public void PreOrder(RealTree root){//利用递归实现前序遍历，输出打印结果
        if(root!=null){
            System.out.print(" "+root.getData());
            PreOrder(root.getlChild());
            PreOrder(root.getrChild());
        }
    }
    public static void main(String[] args) {
        Object data[]={3,9,20,null,null,15,7};
        RealTree binTree=new RealTree();
        binTree.created(data);//创建二叉树
        binTree.PreOrder(binTree.getRoot());//前序遍历结果
    }
}
