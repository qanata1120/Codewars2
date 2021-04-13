package codewars.Arrays;

public class Task22SumArrayElements {
    public static void main(String[]args) {
        int[] a = {1, 2, 3, 4, 5, 6}; //arrays
        //int[] b = new int[100];
        //int[] c = new int[]{10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];   //is the same  to    sum += a[i]
        }
        System.out.print(sum);
    }}

