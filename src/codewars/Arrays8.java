package codewars;
//find sum of 2 arrays numbers
/*public class Arrays8 {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

       /* int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        return sum;
    }*/
        //Advanced script:
       /* int arrSum = 0;
        for(int num : arr1) {arrSum += num;}
        for(int num : arr2) {arrSum += num;}
        return arrSum;
    }*/

/*public static void main(String[] args) {
    int[] arr3 = {1, 1, 1, 1, 1};
    int[] arr4 = {2, 2, 2, 2, 2};
    int sum = arrayPlusArray(arr3, arr4);
    System.out.println(sum);
}
}*/

//A wolf in sheep's clothing
//Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.
//Warn the sheep in front of the wolf that it is about to be eaten. Remember that you are standing at the front of the queue which is at the end of the array:
//[sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
//   7      6      5      4      3            2      1
//If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
//Note: there will always be exactly one wolf in the array.
//Examples
//warnTheSheep(["sheep", "sheep", "sheep", "wolf", "sheep"]) === "Oi! Sheep number 1! You are about to be eaten by a wolf!"
//warnTheSheep(["sheep", "sheep", "wolf"]) === "Pls go away and stop eating my sheep!"

/*public class Arrays8 {

    public static String warnTheSheep(String[] array) {

        for (int i = 0; i < array.length; i++){
            if (array[i].equals("wolf")) {
                if (i == (array.length - 1)) {
                    return "Pls go away and stop eating my sheep!";
                } else {
                    return "Oi! Sheep number " + (array.length - (i + 1)) + "! You are about to be eaten by a wolf!";
                }
            }
        }
            return "";
    }

    public static void main(String[] args) {
            //2, 5, 6, 1, ok
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "wolf"}));
    }
    }*/
/*

//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//invert([]) == []

 *//*
import java.sql.SQLOutput;*/

/*import java.util.Arrays;

public class Arrays8 {

public static int[] invert(int[] array) {
    int[] result = new int[array.length];
    for (int i = 0; i < array.length; i++) {
        result[i] = -array[i];
    }
    return result;
}
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, -3};

        System.out.println(Arrays.toString(invert(arr)));
    }
}*/
//Create a function which answers the question "Are you playing banjo?".
//If your name starts with the letter "R" or lower case "r", you are playing banjo!
//The function takes a name as its only argument, and returns one of the following strings:
//
//name + " plays banjo"
//name + " does not play banjo"
/*public class Arrays8 {
    public static String areYouPlayingBanjo(String name) {
        String result;
        if (name.toLowerCase().charAt(0) == 'r') {
            result = name + " plays banjo";
        } else {
            result = name + " does not play banjo";
        }
        return result;
        }
    public static void main(String[] args) {

        System.out.println(areYouPlayingBanjo("Samanta"));
        System.out.println(areYouPlayingBanjo("Rikke"));
    }}*/


//Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//
//Your task is to make 'Past' function which returns time converted to milliseconds.
//
//Example:
//Past(0, 1, 1) == 61000
//Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59

/*public class Arrays8 {
    public static int Past(int h, int m, int s) {
        int milliseconds;                                 //
                                                    //
        milliseconds = (h * 3600 + m * 60 + s) *1000;   //or we can do milliseconds 1000*(s+60*(m+60*h));

        return milliseconds;                             //and nothing else
    }

    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));

    }
}*/
//import org.w3c.dom.ls.LSOutput;

//import java.util.Arrays;
//import java.util.Objects;

//Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you are
//employed and the second parameter, vacation is true whenever you are on vacation.
//The function should return true if you are employed and not on vacation (because these are the circumstances under
//which you need to set an alarm). It should return false otherwise. Examples:
//setAlarm(true, true) -> false
//setAlarm(false, true) -> false
//setAlarm(false, false) -> false
//setAlarm(true, false) -> true
/*public class Arrays8 {
    public static boolean setAlarm(boolean employed, boolean vacation) {
    return employed && !vacation;

}

    public static void main(String[] args) {
        System.out.println(setAlarm(true, false));
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(false, true));
    }
}*/
/*public class Arrays8 {
    public static void main(String[]args) {
        String a = "Sergey";
        String b = "sergey";
        String c = new String("serge") + "y";
        System.out.println(a == b);           //output False
        System.out.println(b == c);            //False
        System.out.println(a.equals(b));    // output False
        System.out.println(a.equalsIgnoreCase(b));   //True
        System.out.println(b.equals(c));            //True
        System.out.println(Objects.equals(a, c));       //False
        System.out.println(Objects.equals(c, b));      //True

        int[] x = {1, 2};
        int[] y = {1, 2};
        System.out.println(Arrays.equals(x, y));    //True
        }}*/

//Find the smallest difference in between the smallest numbers of each arrays.

/*public class Arrays8 {
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
}*/

