package syntax;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueAndStack {
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
        showall(queue);
        System.out.println("\nisempty?"+queue.isEmpty());
        queue.pollFirst();
//        queue.pollLast();
        showall(queue);
    }

    private static void UsingAsStack() {
        //作为栈使用
        Deque<Integer> stack=new LinkedList<>();
        System.out.println();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(3);
        stack.addFirst(4);
        stack.push(5);
//        stack.add(5);
        System.out.println();
        showall(stack);
        stack.pollFirst();   //获取并移除栈顶元素
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
