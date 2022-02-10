/**
 * Created by ENG on 06/02/2022.
 */
public class SinglyLinkedList<E> {
   private node<E> head=null;
   private node<E> tail=null;
   private int size=0;

    public SinglyLinkedList() {

    }

    public boolean isEmpty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public E first(){
        if(isEmpty())return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty())return null;
        return tail.getElement();

    }

    public void  addFirst(E element)
    {
        head=new node<E>(element,head);
        if (size==0)
            tail=head;
        size++;

    }

    public void addLast(E element)
    {
        node<E> x=new node<E>(element,null);
        if(size==0)
            head=x;
        else
            tail.setNext(x);
        tail=x;
        size++;
    }

    public E removeFirst()
    {
        if(isEmpty())return null;
        E del=head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=null;
        return del;

    }

    private static class node<E>{
        E element ;
        node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }
}
