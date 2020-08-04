package syntax;

import java.util.*;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(33);
        map.put("one", 1);
        map.put("two", "0x00");
        map.put("three",list);
        Iterator<Map.Entry<String,Object>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String,Object> entry = iter.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}
