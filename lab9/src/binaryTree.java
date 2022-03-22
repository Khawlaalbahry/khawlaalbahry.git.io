/**
 * Created by lenovo on 20/03/2022.
 */
public class binaryTree<E> {
    private  Node<E> root=null;
    private int size=0;

    public boolean isEmpty(){
        return size==0;
    }
     public int size(){
         return size;
     }



    protected Node<E> createNode(E e, Node<E> p, Node<E> l, Node<E> r){
         return new Node<E> (e,p,l,r);

    }
        protected Node<E> validate(position<E> p){
            if (!(p instanceof Node))
                throw new IllegalArgumentException("p is not valid");
            Node<E> n=(Node<E>) p;
            if(n.getParent()==n)
                throw new IllegalArgumentException("p is not valid");


            return n;
            }

            public position<E> root() {
                return root;
            }

            public position<E> parent(position<E> p){
                Node<E> n=validate(p);
                return n.getParent();
            }

    public position<E> left(position<E> p){
        Node<E> n=validate(p);
        return n.getLeft();
    }

    public position<E> right(position<E> p){
        Node<E> n=validate(p);
        return n.getRight();
    }

    public int numOfchildern(position<E> p){
        int count=0;
        if(left(p)!=null)
            count++;
        if(right(p)!=null)
            count++;
        return count;
    }





    private static class Node<E> implements position<E>{
        E element;
        Node<E> parent;
        Node<E> left;
        Node<E> right;

        public Node(E element, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = element;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }
    }
}
