package codewars.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Task3_SumOfSpecificNumbersOfArray {

    //Find a sum of all array elements in the range of -10 to 10.
    public static void main(String[] args) {
        int[] arr = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        List<Integer> output = new ArrayList<Integer>();
        // int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -10 && arr[i] < 10) {
                // int j=0;
                output.add(arr[i]);
            }
        }
        System.out.println(output);

        int sum = 0;
        for (int i = 0; i < output.size(); i++) {
            sum += output.get(i);
        }
        System.out.println(sum);
    }
}

