package codewars.Arrays;

import java.util.Arrays;

public class Task27CreateNewArraywithElementsFrom2OtherArrays {
    public static void main(String[]args) {
        int[] a = {5, 7, 3, 2, 7, 6};
        int[] b = {1, 2, 7, 2, 5, 3};
        int[] x = new int[a.length + b.length];
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <a.length + b.length; i++){
            if (i < a.length) {
                x[i] = a[i];
            }  else {
                x[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(x));   // we filled array x with values from array a and array b
    }

}
