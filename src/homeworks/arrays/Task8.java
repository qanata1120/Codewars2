package homeworks.arrays;

public class Task8 {
   /* Дан массив:
    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    необходимо вывести количество элементов в массиве.*/

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
       int count = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){    //count += array[i].length;
               count++;                                    // no this line
                }
            }
        System.out.println(count);
    }
}
