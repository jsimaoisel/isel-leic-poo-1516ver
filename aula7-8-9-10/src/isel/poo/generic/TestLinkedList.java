package isel.poo.generic;

import java.util.Iterator;

/**
 * Created by jsimao on 12-04-2016.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.addFirst("ola");
        strings.addFirst("poo @ isel");
        Iterator<String> it = strings.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println("size is " + e.length());
        }
        System.out.println("again...");
        for(String s : strings) {
            System.out.println("size is " + s.length());
        }
    }
}
