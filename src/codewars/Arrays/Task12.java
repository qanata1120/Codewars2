package codewars.Arrays;

public class Task12 {
    //find sum of 2 arrays numbers
    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        return sum;

        //Advanced script:
       /* int arrSum = 0;
        for (int num : arr1) {
            arrSum += num;
        }
        for (int num : arr2) {
            arrSum += num;
        }
        return arrSum;*/
    }

    public static void main(String[] args){
            int[] arr3 = {1, 1, 1, 1, 1};
            int[] arr4 = {2, 2, 2, 2, 2};
            int sum = arrayPlusArray(arr3, arr4);
            System.out.println(sum);
        }

    }



