package homeworks;

import java.sql.SQLOutput;
import java.util.Arrays;
/*
public class Main {
    public static void main(String[]args) {
        int v = 11;
        int[] a = {1, 2, 3, 4, 5, 6}; //arrays
        int[] b = new int[5];
        int[] c = new int[]{10};

        for (int i =0; i <a.length; i++){     //for arrays methods you dont need (), for variable's methods there is a ()
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[4] = 50;

        System.out.println(a[4]);
        System.out.println(Arrays.toString(a));
    }
}*/
        //i++ = i + 1 postincrement
        //i-- = i - 1
        //--1 predecrement make your value  - 1 first
        //i += 5 is same as i = i + 5
        //i -= 5 is same as i = i - 5
        //i *= 5 is same as i = i * 5
/*
 public class Main {
    public static void main(String[]args) {
        int[] a = {1, 2, 3, 4, 5, 6}; //arrays
        int[] b = new int[100];
        int[] c = new int[]{10};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];   //is the same  to    sum += a[i]
        }
        System.out.print(sum);
    }}*/
/*
public class Main {
    public static void main(String[]args) {
         int[] a = {5, 7, 2, 3, 4, 5, 6}; //arrays
        int max =0;
      //  int index = 0;
        for(int i = 0; i<a.length; i++){
        if (max < a[i]){
            max = a[i];
       //     index =i;
        }}
        System.out.println(max);
      //  System.out.println(index);
    }}
*/

 /*   public class Main {
    public static void main(String[]args) {
    int[] a = {-5, -7, -2, -3, -4, 5, 6}; //arrays
    int max =0;

        for(int i = 0; i<a.length; i++){
        if (max < a[i]){
        max = a[i];
        }}
        System.out.println(max);}}
*\


  /*
  public class Main {
    public static void main(String[]args) {
    int[] a = {-5, -7, -2, -3, -4, 5, 6};
    int max = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){
            if (max < a[i]){
        max = a[i];
        }}
        System.out.println(max);}}

        */

/*public class Main {
            public static void main(String[]args) {
                int[] a = {-5, -7, -2, -3, -4, 5, 6};
                int min = [0];   // Integer.MAX_VALUE;

                for(int i = 0; i<a.length; i++) {
                    if (min < a[i]){
                        min = a[i];
        }}
                System.out.println(min);
}}*/
/*
public class Main {
    public static void main(String[]args) {
        int[] a = {5, 7, 3, 2, 7, 6};
        int[] b = {1, 2, 7, 2, 5, 3};
        int[] x = new int[a.length + b.length];
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <a.length + b.length; i++){
            if (i < a.length) {
                x[i] = a[i];
            }  else {
                x[i] = b[i - a.length];
            }
        }
        System.out.println(Arrays.toString(x));   // we filled array x with values from array a and array b
    }
    }*/
/*
public class Main {
    public static void main(String[]args) {
           int[][] a = {{5, 1}, {7, 5, 6}};
           a[0] = new int[]{10, 20, 30};
           System.out.println(Arrays.toString(a[0]));
    }}*/
/*
public class Main {
    public static void main(String[]args) {
        int[][] a = {{5, 1}, {7, 5, 6}};
        a[0] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(a));
    }}*/
/*
public class Main {
    public static void main(String[]args) {
        int[][] a = {{5, 1}, {7, 5, 6}};
        a[0] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(a));
    }}*/  //prints all array [[10, 20, 30], [7, 5, 6]]

/*public class Main {
    public static void main(String[]args) {
        int[] [] a = {{5, 1}, {7, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}*/ /*
public class Main {
    public static void main(String[]args) {
        int[] [] a = {{5, 1}, {7, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }
    } //output will be all numbers from array in a row
}*//*
public class Main {
    public static void main(String[]args) {
        int[] x = {5, 1};
        int[][] a = {x, {7, 5, 6}};
        System.out.println(Arrays.deepToString(a));
        a[0] = new int[]{1, 2, 3};
        System.out.println(Arrays.deepToString(a));
    }
} //output [[5, 1], [7, 5, 6]]
  // [[1, 2, 3], [7, 5, 6]]*/

/*
 public class Main {
    public static void main(String[]args) {
        int [][] a = {
                {5, 1},
                {7, 5, 6} };
        System.out.println(Arrays.deepToString(a));
        int[] x = a[0];
        x[0] = 100;
        System.out.println(Arrays.deepToString(a));
// output [[5, 1], [7, 5, 6]]
//[[100, 1], [7, 5, 6]]
    }
 }*/
/*
public class Main {
    public static void main(String[]args) {
        int [][] a = {
                {5, 1},
                {7, 5, 6} };
        System.out.println(Arrays.deepToString(a));
        int[] x = a[1];
        x[0] = 100;
        System.out.println(Arrays.deepToString(a));
// output [[5, 1], [7, 5, 6]]
//[[5, 1], [100, 5, 6]]
    }
}*/ /*
public class Main {
    public static void main(String[] args) {
        int[] x = {5, 1};
        int [][]{
            5, 1 },
        {
            7, 5, 6
        }
    };
        System.out.println(Arrays.deepToString(a));
    int[] x = a[1];
    x[0]=100;
        System.out.println(Arrays.deepToString(a));
}}*/