package homeworks.arrays;

public class Task17 {
   /* Дан массив:
    int[] array = {4, 5, 12, 7, 8, 9, 10};
    необходимо вывести не последовательный элемент массива(который идет не попорядку).*/


    public static void main(String[] args) {
        int[] array = {4, 5, 12, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++){
            if (array[i] != i+4) {
                System.out.println(array[i]);
            }
        }
    }}

