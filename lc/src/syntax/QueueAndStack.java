package syntax;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueAndStack {
    //作为队列使用
    private static void UsingAsQueue(){
        Deque<Integer> queue = new ArrayDeque<>();
        System.out.println("isempty?"+queue.isEmpty());
//        queue.addFirst(1);
//        queue.addFirst(2);
//        queue.addFirst(3);
//        queue.addFirst(4);
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.add(5);//add() and addLast() have same effect

        showall(queue);
        System.out.println("\nisempty?"+queue.isEmpty());

        queue.pollFirst();
        showall(queue);

        queue.pop();//pop() and pollFirst() have same effect
        System.out.println();
        showall(queue);
    }

    //作为栈使用
    private static void UsingAsStack() {
        Deque<Integer> stack = new LinkedList<>();
        System.out.println();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        stack.addFirst(4);
        stack.push(5);//push() and addFirst() have same effect
//        stack.add(5);
        System.out.println();
        showall(stack);

        stack.pop();

        System.out.println();
        showall(stack);

        stack.pollFirst();   //获取并移除栈顶元素,pop() and pollFirst() have same effect

        System.out.println();
        showall(stack);
    }

    private static void showall(Deque<Integer> q){
        Iterator iter = q.iterator();
        while(iter.hasNext()){
            Integer n = (int)iter.next();
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        UsingAsQueue();
        UsingAsStack();
    }
}
