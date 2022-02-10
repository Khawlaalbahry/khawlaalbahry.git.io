/**
 * Created by pc on 2/17/2021.
 */
public class Task3 {
    private static int [] a = null;

    public static void main(String[] args) {
        Task3 t = new Task3();
        a = new int[]{1, 2, 3, 4, 1, 6, 7, 8, 9};
        t.findRepeated(a);
    }

    private void findRepeated (int [] numRay)
    {
        for (int i = 0; i < numRay.length; i++) {
            numRay[numRay[i] % numRay.length]
                    = numRay[numRay[i] % numRay.length]
                    + numRay.length;
        }
        System.out.println("The repeating elements are : ");
        for (int i = 0; i < numRay.length; i++) {
            if (numRay[i] >= numRay.length * 2) {
                System.out.println(i + " ");
            }
        }
    }
}
