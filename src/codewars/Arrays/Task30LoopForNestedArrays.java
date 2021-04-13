package codewars.Arrays;

import java.util.Arrays;

public class Task30LoopForNestedArrays {
    public static void main(String[]args) {
        int[] [] a = {{5, 1}, {7, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
