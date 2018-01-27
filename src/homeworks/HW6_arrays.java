package homeworks;


/*
Homework 6 ARRAYS
Задача №1

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];   //the same sum += array[i];
        }
        System.out.println(sum);   //output 59
    }
}
*/
/*
Задача №2

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.*/
/*
public class HW6_arrays {
    public static void main(String[]args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = 0;                                //the same int max = Integer.MIN_VALUE;
        for (int i = 0; i< array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }System.out.println(max);

    }}*/

/*Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*//*
public class HW6_arrays {
    public static void main(String[]args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <array.length; i++){
        if (min > array[i]) {
            min = array[i];
        }
        }
        System.out.println(min);
    }
}*/
/*Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.*/
/*
public class HW6_arrays {
    public static void main(String[]args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;
        for (int i = 0; i < array.length; i++){
        sum = sum + array[i];     // the same sum += array[i];
        }
        System.out.println(sum);
        int average = sum / array.length;
        System.out.println(average);
    }
    }*/

/*Задача №5

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
            sum = sum + array[i][j];     // the same sum += array[i][j];
            }
        }
        System.out.println(sum);

    }}*/


/*Задача №6

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }}*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }}*/

/*Задача №7

Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.*/

/*
public class HW6_arrays {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
       int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){    //count += array[i].length;
               count++;                                    // no this line
                }
            }
        System.out.println(count);
    }}*/

/*Экстра задача

Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
*/

import java.util.Arrays;
/*
public class HW6_arrays {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains("е")) {      //or   if (!array[i][j].contains("е")) {
                } else {                              //     count++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }}*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].indexOf("е") == -1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }}*/
/*
public class HW6_arrays {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains("кто")) {
                    count++;
                }
            }
        }
        System.out.println(count + " \"кто\" in the string");
    }}*/

/*Задача №1
        Дан массив:
        int[] array = {4, 5, 12, 7, 8, 9, 10};
        необходимо вывести не последовательный элемент массива(который идет не попорядку).*/

/*public class HW6_arrays {
    public static void main(String[] args) {
        int[] array = {4, 5, 12, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++){
            if (array[i] != i+4) {
                System.out.println(array[i]);
            }
        }
    }
    }*/
// Find missing numbers in the array.????
/*public class HW6_arrays {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 7, 1, 9, 10};

        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {

                int tmp = 0;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
            }
                System.out.println(array[i]);
            }
        }
    }
}???????????????????*/
        /*Задача №2
        Дано два массива:
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {12, -7, 11};
        необходимо вывести сумму всех элементов двух массивов.*/

/*public class HW6_arrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {12, -7, 11};
        int sum = 0;
        for (int i = 0; i < arr1.length + arr2.length; i++){
            if (i < arr1.length) {
                sum = sum + arr1[i];
            } else
           // if (i < (i - arr1.length)) {
                sum = sum + arr2[i - arr1.length];
            }

        System.out.println(sum);
    }}*/

        /*Задача №3
        Дан массив:
        int[] arr3 = {-1, 2, 3, 4, -5, 11};
        необходимо вывести сумму всех положительных чисел.*/

/*public class HW6_arrays {
    public static void main(String[] args) {
        int[] arr3 = {-1, 2, 3, 4, -5, 11};
        int sum = 0;
        for (int i = 0; i < arr3.length; i++)  {
            if (arr3[i] > 0) {
                sum = sum + arr3[i];
            }
        }
        System.out.println(sum);
    }}*/


        /*Задача №4
        Дано два массива:
        int[] arr4 = {1, 5, 4};
        String[] arr5 = {"2", "-3", "6"};
        необходимо вывести сумму значений массива, как если бы все были числами.*/
/*???????????????????????????????????????????????????????
public class HW6_arrays {
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
        for (int i = 0; i < arr4.length + arr5.length; i++){
            sum = sum + x[i];
        }
        System.out.println(sum);


    }}????????????????????????????????????????*/

        /*Задача №5
        Дан массив и делитель(число):
        int[] numbers = {1, 12, 4, 51, 43, 39, 27};
        int divider = 3;
        необходимо вывести все числа, которые делятся на данный делитель без остатка.*/

/*public class HW6_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 12, 4, 51, 43, 39, 27};
        int divider = 3;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0) {
                System.out.println(numbers[i]);

            }
        }
    }}*/

