/**
 * Created by pc on 2/24/2021.
 */
public class Stack <T> {
    private final T[] array;

    public Stack(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public T[] getArray ()
    {
        return array;
    }
}
