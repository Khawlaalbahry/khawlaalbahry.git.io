import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 29/01/2022.
 */
public class G2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter five elements");
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("before copy");
        for (int i = 0; i <5 ; i++) {
        System.out.print(a[i]+"\t");
    }

        System.out.println();
        System.out.println("after copy array");
        System.out.println(Arrays.toString(copy(a)));
    }
    public static int[] copy(int[]x)
    {
        int n=0;
        for (int i = 0; i <x.length ; i++) {
            int z=x[i];
            x[i]=x[n];
            x[n]=z;
            n++;
        }
        return x ;
    }
}
