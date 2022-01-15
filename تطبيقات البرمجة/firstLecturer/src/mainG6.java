import java.util.Scanner;

/**
 * Created by lenovo on 09/01/2022.
 */
public class mainG6 {
    public static void main(String[] args) {
        G6 team[]=new G6[3];
//        G6 s1=new G6(1,"G3");
//        team[0]=s1;
//        G6 s2=new G6(1,"G3");
//        team[0]=s2;
//        G6 s3=new G6(1,"G3");
//        team[0]=s3;

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
