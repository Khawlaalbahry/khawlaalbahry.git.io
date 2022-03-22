/**
 * Created by lenovo on 22/03/2022.
 */
public class DoublyLinkedList<E> {
    private Node<E>header;
    private Node<E>trailer;
    private int size=0;

    public DoublyLinkedList() {
        header = new Node<E>(null , null , null);
        trailer = new Node<E>(null , header , null);
        header.setNext(trailer);
    }

    public boolean isEmpty(){
        return size== 0;

    }
    public int size(){
        return size;
    }

    public E first(){
        if (isEmpty())return null;
        return header.getNext().getData();
    }

    public E last(){
        if (isEmpty())return null;
        return trailer.getPrev().getData();
    }
    private void addBetween (E data , Node<E> p , Node<E> n){
        Node<E>newst = new Node<E>(data , p , n);
        p.setNext(newst);
        n.setPrev(newst);
        size++;

    }

    public void addFirst (E data){
        addBetween(data,header,header.getNext());
    }
    public void addLast (E data){
        addBetween(data,trailer.getPrev(),trailer);
    }


    private E remove(Node<E> x ){
        Node<E> p=x.getPrev();
        Node<E> n=x.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return x.getData();

    }
    public E removeFirst(){
        if (isEmpty())return null;
        return remove(header.getNext());
    }
    public E removeLast(){
        if (isEmpty())return null;
        return remove(trailer.getPrev());
    }




    private static class Node<E>{
        private E data;
        private Node<E> prev ;
        private Node<E> next;


        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }


        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
