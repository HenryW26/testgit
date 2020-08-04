package ByteDance.Design;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU extends LinkedHashMap<Object,Object> {
    private final int maxCapacity;
    public LRU(int maxCapacity){
        super(maxCapacity,0.75F,true);
        this.maxCapacity=maxCapacity;
    }
    public Object get(int key){
        return super.getOrDefault(key,-1);
    }
    public void put(int key, int value){
        super.put(key,value);
    }

    protected boolean removeEldestEntry(Map.Entry<Object, Object> eldest){
        return size()>maxCapacity;
    }

    public static void main(String[] args) {
        LRU map = new LRU(2);
        map.put(1,1);
        map.put(2,2);
        for(Map.Entry<Object,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        map.get(1);
        for(Map.Entry<Object,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        map.put(3,3);
        for(Map.Entry<Object,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        map.put(4,4);
        for(Map.Entry<Object,Object> entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
