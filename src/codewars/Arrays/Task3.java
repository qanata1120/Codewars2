package codewars.Arrays;

public class Task3 {

    public static void main(String[]args) {
        int[] arr = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int max = 0;
        int[] arr2 = {};
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] > -10 && arr[i] < 10) {
                arr2[i] = new int[i];
                System.out.println(arr2[i]);
            }
        }

        int sum = 0;
        for (int i = 0; i < arr2.length; i++)  {
            sum += arr2[i];
            System.out.println(sum);
        }
    }
}
