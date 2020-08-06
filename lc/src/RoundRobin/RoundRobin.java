package RoundRobin;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class RoundRobin {
    private static AtomicInteger indexAtomic = new AtomicInteger(0);
    public static String getServer(){
        ArrayList<String> serverList = new ArrayList<>(ServerManager.serverMap.keySet());
        if(indexAtomic.get() >= serverList.size()){
            indexAtomic.set(0);
        }
        String server = serverList.get(indexAtomic.getAndIncrement());
        return server;
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(RoundRobin.getServer());
        }
    }
}
