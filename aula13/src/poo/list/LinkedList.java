package poo.list;


public class LinkedList<T> {

    static private class Node<E> {
        private E data;
        private Node<E> next;
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> head;

    public void add(T element) {
        Node<T> n = new Node<T>(element, head);
        head = n;
    }

}

