package homeworks.arrays;

import java.util.Arrays;

public class Task15 {
   /* Дано два массива:
    int[] arr4 = {1, 5, 4};
    String[] arr5 = {"2", "-3", "6"};
    необходимо вывести сумму значений массива, как если бы все были числами.*/

    public static void main(String[] args) {
        int[] arr4 = {1, 5, 4};
        String[] arr5 = {"2", "-3", "6"};
        int size = arr5.length;
        int[] new_array = new int[size];
        for (int i = 0; i < size; i++) {
            new_array[i] = Integer.parseInt(arr5[i]);
        }
        System.out.println(Arrays.toString(arr5));

        int[] x = new int[arr4.length + arr5.length];

        int sum = 0;
        for (int i = 0; i < arr4.length + arr5.length; i++) {
            sum = sum + x[i];
        }
        System.out.println(sum);
    }
}
