import java.util.Scanner;

/**
 * Created by lenovo on 09/01/2022.
 */
public class G5 {
    public static void main(String[] args) {
        int[] A = new int[3];
        inputElement(A);
        printElement(A);
    }

    public static void printElement(int[] x) {
        System.out.println("the array is");
        for (int i = 0; i < 3; i++) {
            System.out.print(x[i] + "\t");
        }
    }
    public static void inputElement(int[] y) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        for (int i = 0; i < y.length; i++)
        {
            y[i] = in.nextInt();
        }
    }
}
