import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        CircularlyLinkedList<String>list= new CircularlyLinkedList<>();
        System.out.println("1 add first\t2 add last \t3 remove First" +
                "\t4 rotate \t 0 exit");
        int choice=-1;
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name:");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.print("input name:");
                    list.addLast(in.next());
                    break;
                case 3:
                    System.out.println("deleted is: "+list.removeFirst());;
                    break;
                case 4:
                    list.rotate();
                    break;
                case 0:
                    System.exit(0);

            }
            System.out.println("first= "+list.first()+"\tlast= "+list.last()+"" +
                    "\tsize="+list.size());
        }
    }
}
