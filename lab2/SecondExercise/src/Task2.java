import java.util.Scanner;

/**
 * Created by pc on 2/8/2021.
 */
public class Task2 {
    public static int [] x = new int[5];
    public static int [] copy;
    public static Scanner s = new Scanner(System.in);

    /**
     * The main method.
     * @param args
     */

    public static void main(String[] args) {
        Task2 ob = new Task2();
        x = new int[]{1, 2, 3, 4, 5};

        System.out.println("Reversing an array : ");
        ob.reverse(x);
        ob.print(x);
        ob.reverse(x);

        System.out.println("\n"+"Copying an array to a backup array : ");
        ob.copyFunction(x);
        ob.print(copy);

        System.out.println("\n"+"Removing element using the index : ");
        ob.remove(x,3);
        ob.print(x);

        x = new int[]{1, 2, 3, 4, 5};

        System.out.println("\n"+"Enter element to remove off the array : ");
        ob.remove(x);
        ob.print(x);

        x = new int[]{1, 2, 3, 4, 5};

        System.out.println("\n"+"Enter numbers to get removed : ");
        ob.removeEntry(x);
    }

    /**
     *A function used to reverse an array.
     * @param array
     */

    public void reverse (int [] array)
    {
        int [] y = new int [array.length];
        for (int i = 0; i <array.length ; i++) {
            y[i] = array[array.length-1-i];
        }

        for (int i = 0; i <array.length ; i++) {
            array[i] = y[i];
        }
    }

    /**
     * A function used to copy an array to a backup array.
     * @param array
     */

    public void copyFunction (int [] array)
    {
        copy = new int [array.length];
        for (int i = 0; i <array.length ; i++) {
            copy[i] = array[i];
        }
    }

    /**
     * A function used to remove an element off an array by the index as an input.
     * @param array
     * @param index
     */

    public void remove (int [] array,int index)
    {
        int i;
        for ( i = index; i <array.length-1 ; i++) {
            array [i] = array [i+1];
        }
        array [i] = 0;
    }

    /**
     * A function used to remove an element off an array by the element itself as an input.
     * @param array
     */

    public void remove (int [] array)
    {
        int o = s.nextInt();
        int index = getIndex(array,o);
        if (index != array.length)
            remove(array,index);
        else
            System.out.println("not found");
    }

    /**
     * A function used to get the index of an array by the element itself as an input.
     * @param array
     * @param x
     * @return
     */

    public int getIndex (int [] array ,int x)
    {
        int index = array.length ;
        for (int i = 0; i <array.length ; i++) {
            if ( x == array[i] )
                index = i;
            else
                continue;
        }
        return index;
    }

    /**
     * A function used to print an array.
     * @param array
     */

    public void print (int [] array)
    {
        System.out.print("[");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
            if (i != array.length-1)
                System.out.print(",");
            else
                break;
        }
        System.out.println("]");
    }

    /**
     * A function used to remove random entries off an array until the array has
     * no more elements.
     * @param array
     */

    public void removeEntry (int [] array)
    {
        int i = 0;
        while ( i < array.length )
        {
            remove(array);
            i++;
            print(array);
        }
        System.out.println("The array is empty now.");
    }
}


