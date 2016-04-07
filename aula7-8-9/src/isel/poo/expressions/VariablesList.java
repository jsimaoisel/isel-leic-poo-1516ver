package isel.poo.expressions;

/**
 * Created by jsimao on 05-04-2016.
 */

class PairNameValueNode {
    public String name;
    public double value;
    public PairNameValueNode next;
}

public class VariablesList {

    // tabela de nomes de variaveis e valores
    PairNameValueNode head;

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

    public void printValues() {

    }

    private PairNameValueNode currPosition;

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
    }
}
