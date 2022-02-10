/**
 * Created by pc on 3/3/2021.
 */
public class task5 {

    public static void main(String[] args) {
        SinglyLinkedList <Integer> x = new SinglyLinkedList<>();
        x.addLast(1);
        x.addLast(2);
        x.addLast(3);
        x.addLast(4);
        x.findSecondToLast();
        x.rotate(5);
        System.out.println("---------------------");
        x.findSecondToLast();
    }


}
