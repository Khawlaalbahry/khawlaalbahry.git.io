import java.util.Scanner;

/**
 * Created by server on 3/18/2022.
 */
public class TestCircular {
    public static void main(String[] args) {
        Circular<Integer> link=new Circular<>();
        Scanner in=new Scanner(System.in);
        System.out.println("enter number for link" );
        for (int i = 0; i <3 ; i++) {
            link.addFirst(in.nextInt());

        }
        boolean x=link.equals(link);
        System.out.println(x);
        System.out.println("stop");
    }

}
