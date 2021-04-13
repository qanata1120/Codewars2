package codewars.Arrays;

import java.util.Arrays;

public class Task29InitilizeNewNestedArrayElements {
    public static void main(String[]args) {
        int[][] a = {{5, 1}, {7, 5, 6}};
        a[0] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(a));//prints all array [[10, 20, 30], [7, 5, 6]]
    }}

