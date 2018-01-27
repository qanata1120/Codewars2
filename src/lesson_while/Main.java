package lesson_while;

/*public class Main {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10 ) {
            System.out.println("I plant the tree");
            a++;
        }
        System.out.println("I planted a forest");
    }
}*/

/*public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a < 11 ) {
            while (b < 11) {
            System.out.print(a * b + " ");
            b++;
            }
            a++;
            b = 1;
            System.out.println();

        }

    }}*/

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int[] arr = {a, b, c, d};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }}
