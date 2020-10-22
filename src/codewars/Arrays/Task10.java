package codewars.Arrays;

import java.util.Arrays;

public class Task10 {

    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, -3};

        System.out.println(Arrays.toString(invert(arr)));
    }

}
