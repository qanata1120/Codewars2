package homeworks.arrays;

public class Task7 {

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
        }}

