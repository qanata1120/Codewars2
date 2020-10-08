package codewars.Arrays;

public class Task19 {

    //https://www.codewars.com/kata/55192f4ecd82ff826900089e/train/java
    /*It's too hot, and they can't even…
        One hot summer day Pete and his friend Billy decided to buy watermelons. They chose the biggest crate.
        They rushed home, dying of thirst, and decided to divide their loot, however they faced a hard problem.

        Pete and Billy are great fans of even numbers, that's why they want to divide the number of watermelons
         in such a way that each of the two parts consists of an even number of watermelons. However, it is not
          obligatory that the parts are equal.

        Example: the boys can divide a stack of 8 watermelons into 2+6 melons, or 4+4 melons.

        The boys are extremely tired and want to start their meal as soon as possible, that's why you should
        help them and find out, whether they can divide the fruits in the way they want. For sure, each of them
         should get a part of positive weight.

        Task
        Given an integral number of watermelons, check whether Pete and Billy can divide the melons so that
        each of them gets an even amount.

        Examples
        divide(2) == false // 2 = 1 + 1
        divide(3) == false // 3 = 1 + 2
        divide(4) == true  // 4 = 2 + 2
        divide(5) == false // 5 = 2 + 3
        divide(6) == true  // 6 = 2 + 4*/


    public static boolean divide(int weight) {
        int a;
        int b;
        int mass = weight;
        Boolean result = true;
        String statement = "";
        if (mass % 2 == 0 && mass != 2) {
            for (a = 2; a < mass; a += 2) {
                b = mass - a;
                if (b % 2 == 0) {
                    result = true;
                    System.out.println("Weight can be devided as " + a + " + " + b);
                } else {
                    result = false;
                    System.out.println("Weight cannot be devided in 2 even numbers.");
                }
            }
        } else {
            result = false;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("1. " + divide(4));
        System.out.println("2. " + divide(2));
        System.out.println("3. " + divide(5));
        System.out.println("4. " + divide(88));
        System.out.println("5. " + divide(100));
        System.out.println("6. " + divide(67));
        System.out.println("7. " + divide(90));
        System.out.println("8. " + divide(10));
        System.out.println("9. " + divide(99));
        System.out.println("10. " + divide(32));

    }
}

