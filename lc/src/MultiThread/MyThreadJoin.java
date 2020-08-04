package MultiThread;

public class MyThreadJoin implements Runnable {
    public MyThreadJoin(){
    }
    @Override
    public void run() {
        for(int i=0;i<50;i++){
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){

            }
            System.out.println(Thread.currentThread().getName()+" is running,i="+i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadJoin(),"t1");
//        Thread thread2 = new Thread(new MyThread(),"A");
        thread1.start();
//        thread2.start();
        for(int i=0;i<50;i++){
            if(i>10){
                try{
                    thread1.join();
                }
                catch (InterruptedException e){
                }
            }
            System.out.println("Main thread--"+i);
        }
    }
}
