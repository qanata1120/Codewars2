package codewars.Arrays;

import java.util.Arrays;

public class Task33InitializeNewElemetnInArray2 {
    public static void main(String[]args) {
        int [][] a = {
                {5, 1},
                {7, 5, 6} };
        System.out.println(Arrays.deepToString(a));
        int[] x = a[0];
        x[0] = 100;
        System.out.println(Arrays.deepToString(a));
// output [[5, 1], [7, 5, 6]]
//[[100, 1], [7, 5, 6]]
    }

}
