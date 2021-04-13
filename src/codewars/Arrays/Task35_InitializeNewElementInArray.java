package codewars.Arrays;

import java.util.Arrays;

public class Task35_InitializeNewElementInArray {
    public static void main(String[] args) {
        int[] x = {5, 1};
        int [][] a = {{5, 1}, { 7, 5, 6 }};
        System.out.println(Arrays.deepToString(a));

        a[0][0] = 100;
        System.out.println(Arrays.deepToString(a));

}}
