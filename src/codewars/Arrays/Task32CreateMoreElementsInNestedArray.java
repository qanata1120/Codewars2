package codewars.Arrays;

import java.util.Arrays;

public class Task32CreateMoreElementsInNestedArray {
    public static void main(String[]args) {
        int[] x = {5, 1};
        int[][] a = {x, {7, 5, 6}};
        System.out.println(Arrays.deepToString(a));
        a[0] = new int[]{1, 2, 3};
        System.out.println(Arrays.deepToString(a));
    }           //output [[5, 1], [7, 5, 6]]
                // [[1, 2, 3], [7, 5, 6]]*/
}

