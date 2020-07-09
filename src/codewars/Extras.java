package codewars;


//https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java

//https://www.codewars.com/kata/55192f4ecd82ff826900089e/train/java
/*It's too hot, and they can't even…
        One hot summer day Pete and his friend Billy decided to buy watermelons. They chose the biggest crate. They rushed home, dying of thirst, and decided to divide their loot, however they faced a hard problem.

        Pete and Billy are great fans of even numbers, that's why they want to divide the number of watermelons in such a way that each of the two parts consists of an even number of watermelons. However, it is not obligatory that the parts are equal.

        Example: the boys can divide a stack of 8 watermelons into 2+6 melons, or 4+4 melons.

        The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, whether they can divide the fruits in the way they want. For sure, each of them should get a part of positive weight.

        Task
        Given an integral number of watermelons, check whether Pete and Billy can divide the melons so that each of them gets an even amount.

        Examples
        divide(2) == false // 2 = 1 + 1
        divide(3) == false // 3 = 1 + 2
        divide(4) == true  // 4 = 2 + 2
        divide(5) == false // 5 = 2 + 3
        divide(6) == true  // 6 = 2 + 4*/

/*public class Extras {
    public static boolean divide(int weight) {
        int a;
        int b;
        int weight = (a + b);
        for (int i = 0; i < weight; i++) {
            if (i % 2 == 0  && i % 2 == 0) {
           // if (a % 2 == 0 && b % 2 == 0) {
                return true;
            }
        }

    }
        public static void main(String[] args){
            System.out.println(divide(4));
            System.out.println(divide(2));
            System.out.println(divide(5));
            System.out.println(divide(88));
            System.out.println(divide(100));
            System.out.println(divide(67));
            System.out.println(divide(90));
            System.out.println(divide(10));
            System.out.println(divide(99));
            System.out.println(divide(32));

    }
}*/

//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
/*public class Extras {
    public static int squareSum(int[] n) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
        sum += n[i] * n[i];
    }
    return sum;
}

            public static void main(String[] args){
            System.out.println(squareSum(new int[] {1,2,2}));
            System.out.println(squareSum(new int[] {1,2}));
            System.out.println(squareSum(new int[] {5,-3,4}));
        }
}*/

//This kata is from check py.checkio.org
//
//You are given an array with positive numbers and a number N. You should find the N-th power of the element in the array with the index N. If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
//
//Let's look at a few examples:
//
//array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.

/*public class Extras {



    public static void main(String[] args){
        nthPower(new int[] {1,2}, 2));
        nthPower(new int[] {3,1,2,2}, 3));
        nthPower(new int[] {3,1,2}, 2));
    }}???*/


//Nathan loves cycling.
//
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//
//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
//
//For example:
//
//time = 3 ----> litres = 1
//
//time = 6.7---> litres = 3
//
//time = 11.8--> litres = 5

/*public class Extras {
public int Liters(double time)  {

        return (int) time / 2;
}

    public static void main(String[] args){

        System.out.println(Liters(1600.20));
    }}???*/

//https://www.codewars.com/kata/57eae65a4321032ce000002d/train/java

/*public class Extras {
public static String fakeBin(String numberString) {
        return "";
        //return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");

    public static void main(String[] args){}}*/

