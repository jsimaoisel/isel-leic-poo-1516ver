package isel.poo.expressions;

import java.util.Iterator;

/**
 * Created by jsimao on 05-04-2016.
 */

class PairNameValueNode {
    public String name;
    public double value;
    public PairNameValueNode next;
}

class VariableIterator implements Iterator {
    private PairNameValueNode curr;
    public VariableIterator(PairNameValueNode first) {
        curr = first;
    }
    public boolean hasNext() {
        return curr != null;
    }
    public Object next() {
        String n = curr.name;
        curr = curr.next;
        return n;
    }
}

public class VariablesList implements Iterable {

    // tabela de nomes de variaveis e valores
    private PairNameValueNode head;
    //private PairNameValueNode currPosition;

    public VariablesList() {
        head = null;
    }

    public void setVar(String name, double value) {
        PairNameValueNode curr = head;
        while (curr != null) {
            if (curr.name.equals(name)) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }
        PairNameValueNode pair = new PairNameValueNode();
        pair.name = name;
        pair.value = value;
        pair.next = head;  // 1
        head = pair;       // 2
    }

    public double getVar(String name) {
        PairNameValueNode curr = head;
        while (curr != null) {
            if (curr.name.equals(name)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return Double.NaN;
    }

    public Iterator iterator() {
        return new VariableIterator(head);
    }

    /*
    public String getFirst() {
        if (head == null) {
            currPosition = null;
            return null;
        }
        currPosition = head.next;
        return head.name;
    }

    public String getNext() {
        if (currPosition == null) {
            return null;
        }
        String n = currPosition.name;
        currPosition = currPosition.next;
        return n;
    }*/


}
