/**
 * Created by lenovo on 23/01/2022.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();


}
