/**
 * Created by server on 3/18/2022.
 */
public class Doubly {
    static class Node {
        char data;
        Node prev;
        Node next;
    }

    static Node head = null;

    static void rotate(int N) {
        if (N == 0)
            return;
        Node current = head;
        int count = 1;
        while (count < N && current != null) {
            current = current.next;
            count++;
        }
        if (current == null)
            return;
        Node NthNode = current;
        while (current.next != null)
            current = current.next;
        current.next = head;
        (head).prev = current;
        head = NthNode.next = null;
    }

    static void push(char new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null && node.next != null) {
            System.out.println(node.data);
            node = node.next;
            if (node != null)
                System.out.println(node.data);

        }

    }

    public static void main(String[] args) {
        public static void main (String[]args){
            push('e');
            push('d');
            push('c');
            push('b');
            push('a');
            int N = 2;
            System.out.println("give linked list");
            printList(head);
            rotate(N);
            System.out.println("rotate linked list ");
            printList(head);
        }


    }
}