package homeworks.arrays;

public class Task16 {

        /*Дан массив и делитель(число):
        int[] numbers = {1, 12, 4, 51, 43, 39, 27};
        int divider = 3;
        необходимо вывести все числа, которые делятся на данный делитель без остатка.*/


    public static void main(String[] args) {
        int[] numbers = {1, 12, 4, 51, 43, 39, 27};
        int divider = 3;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0) {
                System.out.println(numbers[i]);

            }
        }
    }
}
