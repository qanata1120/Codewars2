package codewars.Arrays;

public class Task24 {
    public static void main(String[] args) {
        int[] a = {-5, -7, -2, -3, -4, 5, 6}; //arrays
        int max = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}

