package syntax;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIteratorAndLinkedList {
    LinkedList<String> a = new LinkedList<>();

    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("5");
        a.add("4");
        a.addFirst("0");
        a.addLast("6");
        Iterator iter =a.iterator();
        while(iter.hasNext()){
            String str = (String) iter.next();
            System.out.println(str);
        }
    }
}
