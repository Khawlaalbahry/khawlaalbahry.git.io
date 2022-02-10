/**
 * Created by pc on 2/15/2021.
 */
public class LECTask {

    public static void main(String[] args) {

    }

    public int getIndex (int [] array ,int x)
    {
        int index = array.length ;
        for (int i = 0; i <array.length ; i++) {
            if ( x == array[i] )
            {
                index = i;
                break;
            }
            else
                continue;
        }
        return index;
    }

    public void merging (int [] a1,int [] a2)
    {
        int [] a3 = new int [a1.length+a2.length];
        for (int i = 0; i <a3.length ; i++) {
            if (i < a1.length)
                a3[i] = a1[i];
            else
                a3[i] = a2[i];
        }
    }
}



