package homeworks.arrays;

public class Task4 {
   /* Дан массив:
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    необходимо вывести среднее арифметическое всех значений массива.*/

    public static void main(String[]args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;
        for (int i = 0; i < array.length; i++){
        sum = sum + array[i];     // the same sum += array[i];
        }
        System.out.println(sum);
        double average = sum / array.length;
        System.out.println(average);
    }

}
