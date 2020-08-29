package codewars.Arrays;

import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {
        int[] x = {5, 1};
        int [][] a = { 5, 1 }, { 7, 5, 6 }
        System.out.println(Arrays.deepToString(a));
    int[] x = a[1];
    x[0]=100;
        System.out.println(Arrays.deepToString(a));

}
