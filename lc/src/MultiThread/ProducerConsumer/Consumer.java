package MultiThread.ProducerConsumer;

public class Consumer implements Runnable{
    private Storage storage;
    public Consumer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
                storage.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
