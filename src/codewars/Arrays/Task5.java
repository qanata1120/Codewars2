package codewars.Arrays;

public class Task5 {

}
    //Find the smallest difference in between the smallest numbers of each arrays.

public class Arrays8 {
    public static void main(String[] agrs) {
        int[] x = {1, 2, 3};
        int[] y = {7, 5, 10};

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        int minDifference = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] < minX) {
                minX = x[i];
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] < minY) {
                minY = y[i];
            }
        }
        minDifference = Math.abs(minX - minY);
        System.out.println(minX);
        System.out.println(minY);
        System.out.println(minDifference);
    }
}
