/**
 * Created by server on 3/18/2022.
 */
public class CircularyLinkedList<E> {
    private Node<E> tail=null;
    private int size=0;
    public CircularyLinkedList()
    {

    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }

    public E first()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addfirst(E element)
    {
        tail=new Node<E>(element,null);
        if (isEmpty())
            tail=new Node<E>(element,tail,getNext());
        tail.setNext();

    }


}
