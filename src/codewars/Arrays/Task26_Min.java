package codewars.Arrays;

public class Task26_Min {
    public static void main(String[] args) {
        int[] a = {-5, -7, -2, -3, -4, 5, 6};
        int min = 0;   // Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
