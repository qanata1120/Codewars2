package codewars.Arrays;

public class Task31 {

    public static void main(String[] args) {
        int[][] a = {{5, 1}, {7, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    } //output will be all numbers from array in a row
}
