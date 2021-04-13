package codewars.Arrays;

import java.util.Arrays;

public class Task34InitializingNewElementInArray1 {
    public static void main(String[]args) {
        int [][] a = {{5, 1}, {7, 5, 6} };
        System.out.println(Arrays.deepToString(a));
        int[] x = a[1];
        x[0] = 100;
        System.out.println(Arrays.deepToString(a));
// output [[5, 1], [7, 5, 6]]
//[[5, 1], [100, 5, 6]]
    }

}
