package codewars.Arrays;

public class Task25 {
    public static void main(String[]args) {
        int[] a = {-5, -7, -2, -3, -4, 5, 6};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){
            if (max < a[i]){
                max = a[i];
            }}
        System.out.println(max);}}

}
