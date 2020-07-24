package codewars.Arrays;

import java.util.Arrays;

public class Task28 {
    public static void main(String[]args) {
        int[][] a = {{5, 1}, {7, 5, 6}};
        a[0] = new int[]{10, 20, 30};
        System.out.println(Arrays.toString(a[0]));
    }}

