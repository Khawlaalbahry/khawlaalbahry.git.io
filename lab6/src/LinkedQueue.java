


public class LinkedQueue<E>implements Queue<E> {
    SinglyLinkedList<E>l=new SinglyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return l.isEmpty();
    }
    @Override
    public int size() {
        return l.size();
    }
    @Override
    public void enqueue(E e) {
        l.addLast(e);
    }
    @Override
    public E dequeue() {
        return l.removeFirst();
    }
    @Override
    public E first() {
        return l.first();
    }
}
