package codewars.Arrays;

import java.util.Arrays;
import java.util.Objects;

public class Task7 {

    public static void main(String[]args) {
        String a = "Sergey";
        String b = "sergey";
        String c = new String("serge") + "y";
        System.out.println(a == b);           //output False
        System.out.println(b == c);            //False
        System.out.println(a.equals(b));    // output False
        System.out.println(a.equalsIgnoreCase(b));   //True
        System.out.println(b.equals(c));            //True
        System.out.println(Objects.equals(a, c));       //False
        System.out.println(Objects.equals(c, b));      //True

        int[] x = {1, 2};
        int[] y = {1, 2};
        System.out.println(Arrays.equals(x, y));    //True
        }
}
