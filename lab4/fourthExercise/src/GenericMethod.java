/**
 * Created by pc on 2/24/2021.
 */
public class GenericMethod {

    public static void main(String[] args) {
        Integer [] x = {1,2,3,4,5,6};
        Integer [] y = {7,8,9};
        GenericMethod g = new GenericMethod();
        g.reverse(x);
        print(x);
        g.reverse(x);
        g.merging(x,y);
    }

    /**
     * generic method to reverse arrays of any type
     * @param array
     * @param <E>
     */

    private <E> void reverse (E array [])
    {
        for (int i = 0; i < array.length/2 ; i++) {
            E t = array [i];
            array [i] = array [array.length - 1 - i];
            array [array.length - 1 - i] = t;
        }
    }

    /**
     * generic method to merge tow arrays of any type
     * @param a1
     * @param a2
     * @param <E>
     */

    private <E> void merging (E a1 [],E a2 [])
    {
        Stack <E> s = new Stack<E>(a1.length+a2.length);
        E newArr [] = s.getArray();
        for (int i = 0; i < newArr.length ; i++) {
            if ( i < a1.length )
                newArr [i] = a1 [i];
            else
                newArr [i] = a2 [i-a1.length];
        }
        print(newArr);
    }

    /**
     * printing method (generic)
     * @param arr
     * @param <E>
     */

    public static <E> void print (E arr[])
    {
        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i != arr.length-1 )
                System.out.print(",");
            else
                continue;
        }
        System.out.println("]");
    }
}
