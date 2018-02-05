package codewars.Arrays;

public class Task8 {

//Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//
//Your task is to make 'Past' function which returns time converted to milliseconds.
//
//Example:
//Past(0, 1, 1) == 61000
//Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59


    public static int Past(int h, int m, int s) {
        int milliseconds;                                 //
                                                    //
        milliseconds = (h * 3600 + m * 60 + s) *1000;   //or we can do milliseconds 1000*(s+60*(m+60*h));

        return milliseconds;                             //and nothing else
    }

    public static void main(String[] args) {
        System.out.println(Past(0, 1, 1));

    }
}
