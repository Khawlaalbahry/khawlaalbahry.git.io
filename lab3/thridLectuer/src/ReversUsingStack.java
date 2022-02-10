import java.util.Arrays;

/**
 * Created by lenovo on 23/01/2022.
 */
public class ReversUsingStack {
    public static void main(String[] args) {
        int []a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        ArrayStack<Integer>s=new ArrayStack<>(a.length);

        for (int i = 0; i < a.length; i++) {
            s.push(a[i]);

        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }
        System.out.println("after revers using stack");
        System.out.println(Arrays.toString(a));
    }
}
