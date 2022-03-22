/**
 * Created by server on 3/18/2022.
 */
public class Node <E> {
    private E element;
    private Node<E> next;
    public Node(E element,Node<E> next)
    {
        this.element=element;
        this.next=next;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
