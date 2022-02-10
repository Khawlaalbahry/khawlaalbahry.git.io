import java.util.Scanner;

/**
 * Created by HP on 30/01/2022.
 */
public class testQueue {
    public static void main(String[] args) {
        System.out.println("input queue elements");
        ArrayQueue <Character> queue=new ArrayQueue<>( 5);
        Scanner in =new Scanner(System.in);
        for (int i = 0; i <6 ; i++) {
            queue.enqueue(in.next().charAt(0));
            System.out.println("first"+queue.first());
            System.out.println("size"+queue.size());
        }
        System.out.println("all element are");
        while (!queue.isEmpty())
            System.out.println(queue.dequeue()+"\t");
    }
}
