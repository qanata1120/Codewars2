package homeworks.arrays;

public class Task12 {
    //Find missing numbers in the array.

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
}
