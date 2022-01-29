import java.util.Scanner;

/**
 * Created by lenovo on 09/01/2022.
 */
public class mainG6 {
    public static void main(String[] args) {
        G6 team[]=new G6[3];

        Scanner in=new Scanner(System.in);
        System.out.println("enter 3 id and name");
        for (int i = 0; i <team.length ; i++) {
            G6 s=new G6(in.nextInt(),in.next());
            team[i]=s;
        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());
        }
    }
}
