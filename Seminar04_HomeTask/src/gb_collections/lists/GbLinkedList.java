package gb_collections.lists;

import gb_collections.GbList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GbLinkedList<E> implements GbList<E> {

    int size;
    Node<E> head;

    public GbLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(E value) {
        if (isEmpty()) {
            this.head = new Node<E>(null, value, null);
        } else {
            Node<E> temp = new Node<E>(head, value, null);
            this.head.next = temp;
            this.head = temp;
        }
        size++;
    }

    @Override
    public void add(int index, E value) {
        if (index > size) throw new IndexOutOfBoundsException();
        Node<E> current = this.head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                current.prev = new Node<E>(current.prev, value, current);
                size++;
                return;
            }
            current = current.next;
        }

    }

    @Override
    public E get(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        Node<E> current = this.head;
        E res = null;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                res = current.data;
            }
            current = current.next;
        }
        return res;
    }

    @Override
    public void remove(E value) {
        Node<E> current = this.head;

        for (int i = 0; i < size; i++) {
            if (current.data.equals(value)) {
                Node<E> prev = current.prev;
                Node<E> next = current.next;
                prev.next = next;
                next.prev = prev;

                size--;
                return;
            }
            current = current.prev;
        }

    }


    @Override
    public void removeByIndex(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        Node<E> current = this.head;
        Node<E> prev = null;
        Node<E> next = null;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                try {
                    if (i != 0) {
                        prev = current.prev;
                    }
                    next = current.next;

                    prev.next = next;
                    next.prev = prev;
                    } catch (NullPointerException n) {
                        System.out.println(n.getMessage());
                    }
                    size--;
                    return;
            }
            current = current.prev;
        }

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) { throw new NoSuchElementException(); }
                E item = (E) current.data;
                current = current.prev;
                return item;
            }
        };
    }
    private static class Node<E> {
        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("[");
        for (E item : this) {
            builder.append(item).append(" ");
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();

    }
}
