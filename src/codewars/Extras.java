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




