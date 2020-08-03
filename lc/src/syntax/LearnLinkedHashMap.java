package syntax;

import java.util.*;

public class LearnLinkedHashMap {
    public static void main(String[] args) {
        //output of the Hashmap is arbitary, not in a specific order
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("name1", "josan1");
        hashMap.put("name2", "josan2");
        hashMap.put("name3", "josan3");
        Set<Map.Entry<String,String>> set = hashMap.entrySet();
        Iterator<Map.Entry<String,String>> iter = set.iterator();
        while(iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+",value:"+value);
        }
        //output of the linkedHashMap is in order
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("name1", "josan1");
        linkedHashMap.put("name2", "josan2");
        linkedHashMap.put("name3", "josan3");
        Set<Map.Entry<String,String>> linkedset = linkedHashMap.entrySet();
        Iterator<Map.Entry<String,String>> iter2 = linkedset.iterator();
        while(iter2.hasNext()){
            Map.Entry<String,String> entry = iter2.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+",value:"+value);
        }
    }
}
