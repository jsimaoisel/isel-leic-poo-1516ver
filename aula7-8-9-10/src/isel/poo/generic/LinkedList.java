package isel.poo.generic;

import java.util.Iterator;

/**
 * Created by jsimao on 12-04-2016.
 */

class Node<E> {
    public E data;
    public Node<E> next;
}

class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> curr;

    public LinkedListIterator(Node<T> first) {
        curr = first;
    }

    public boolean hasNext() {
        return curr != null;
    }

    public T next() {
        T elem = curr.data;
        curr = curr.next;
        return elem;
    }
}

public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private int count;
    public LinkedList() {
        head = null;
        count = 0;
    }
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(head);
    }
    public void addFirst(T elem) {
        Node<T> node = new Node<T>();
        node.data = elem;
        node.next = head;
        head = node;
        ++count;
    }
    public int size() {return count;}
}
