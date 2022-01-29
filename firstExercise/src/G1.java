import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lenovo on 29/01/2022.
 */
public class G1 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter five elements");
        for (int i = 0; i < 5; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("After reverse");
        System.out.println(Arrays.toString(revers(a)));
    }
    public static int[] revers(int[]x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            int z=x[i];
            x[i]=x[n];
            x[n]=z;
            n--;
        }
        return x ;
    }
}
