import java.util.Arrays;

/**
 * Created by lenovo on 16/01/2022.
 */
public class G1 {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(revers(a)));
    }
    public static int[] revers(int[]x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
           int t=x[i];
            x[i]=x[n];
            x[n]=t;
            n--;
        }
       return x ;
    }

}
