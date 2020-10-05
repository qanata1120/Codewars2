package homeworks.arrays;

public class Task13 {
   /* Дано два массива:
    int[] arr1 = {4, 5, 6};
    int[] arr2 = {12, -7, 11};
    необходимо вывести сумму всех элементов двух массивов.*/


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
    }
}
