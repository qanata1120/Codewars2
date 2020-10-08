package codewars.Arrays;

public class Task17_NthPowerOfNumber {

//You are given an array with positive numbers and a number N. You should find the N-th power
// of the element in the array with the index N. If N is outside of the array, then return -1.
// Don't forget that the first element has the index 0.
//
//Let's look at a few examples:
//
//array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.

    public static int nthPower(int[] arr, int n) {
        // int[] arr1 = {1, 2, 3};
        // int n1 = 2;
        int result = 1;
        for (int i = 0; i <= arr.length; i++) {
            if ((i == arr.length - 1) && (n > i)) {
                result = -1;
                break;
            }
            if (i == n) {
                while (n != 0) {
                    result *= arr[i];
                    --n;

                    //or similar block of code instead:
                    //for (; n != 0; --n){
                    //    result *= arr[i];
                    //}
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(nthPower(new int[]{1, 2}, 2));
        System.out.println(nthPower(new int[]{3, 1, 2, 2}, 3));
        System.out.println(nthPower(new int[]{3, 1, 2}, 2));
    }
}

