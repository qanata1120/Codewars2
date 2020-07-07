package codewars.Arrays;

import java.util.Arrays;

public class Task21 {
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
    }}

//i++ = i + 1 postincrement
//i-- = i - 1
//--1 predecrement make your value  - 1 first
//i += 5 is same as i = i + 5
//i -= 5 is same as i = i - 5
//i *= 5 is same as i = i * 5


