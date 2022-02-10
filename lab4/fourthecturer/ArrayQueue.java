/**
 * Created by HP on 30/01/2022.
 */
public class ArrayQueue <T> implements Queue <T> {

    T data[];
    int f=0;
    int sz=0;
    static final  int Capacity=100;


    public ArrayQueue(int c){
        data= (T[]) new Object[c];
    }
public ArrayQueue(){
    this(Capacity);
}
    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(T element) {
if (size()==data.length)
    throw  new IllegalStateException("Queue is full");
        int i =(f+sz)%data.length;
        data[i]=element;
        sz++;
    }

    @Override
    public T dequeue() {
        if(isEmpty())return null;
        T x=data[f];
        data[f]=null;
        sz--;
        f=(f+1)%data.length;
        return x;

    }

    @Override
    public T first() {
        if (isEmpty())
        return null;
        return  data[f];
    }
}
