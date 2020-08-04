package MultiThread.ProducerConsumer;

import java.util.LinkedList;

public class Storage {
    //Storage Size
    private final int MAX_SIZE = 10;
    //Storage Content
    private LinkedList<Object> list = new LinkedList<>();

    public void produce(){
        synchronized (list){
            while(list.size()>=MAX_SIZE){
                System.out.println("Producer"+Thread.currentThread().getName()+
                        ",Stroage is full");
                try{
                    list.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println("Producer"+Thread.currentThread().getName()+
                    "produced a product, now Storage has"+list.size()+"products");
            list.notifyAll();
        }
    }

    public void consume(){
        synchronized (list){
            while (list.size()<=0){
                System.out.println("Consumer"+Thread.currentThread().getName()+
                        ",Storage is empty");
                try{
                    list.wait();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("Consumer"+Thread.currentThread().getName()+
                    "fetched a product, now Storage has"+list.size()+"products");
            list.notifyAll();
        }
    }
}
