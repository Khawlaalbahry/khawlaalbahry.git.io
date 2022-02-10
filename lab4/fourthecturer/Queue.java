/**
 * Created by HP on 30/01/2022.
 */
public interface Queue <T> {

    boolean isEmpty();
    int size();
    void enqueue(T element);
    T dequeue();
    T first();
}
