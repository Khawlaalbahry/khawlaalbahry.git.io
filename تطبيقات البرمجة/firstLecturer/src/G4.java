import java.util.Scanner;

/**
 * Created by lenovo on 09/01/2022.
 */
public class G4 {
    public static void main(String[] args) {

    int[] A=new int[3];
    Scanner in=new Scanner(System.in);
    System.out.println("enter the 3 number");
        for (int i = 0; i <A.length ; i++) {
            A[i]=in.nextInt();

        }
        System.out.println("the array is");
        for (int i = 0; i <3 ; i++) {

            System.out.print(A[i]+"\t");

        }






}
}
