package homeworks.arrays;

public class Task14 {
    /*Дан массив:
    int[] arr3 = {-1, 2, 3, 4, -5, 11};
    необходимо вывести сумму всех положительных чисел.*/

    public static void main(String[] args) {
        int[] arr3 = {-1, 2, 3, 4, -5, 11};
        int sum = 0;
        for (int i = 0; i < arr3.length; i++)  {
            if (arr3[i] > 0) {
                sum = sum + arr3[i];
            }
        }
        System.out.println(sum);
    }
}
