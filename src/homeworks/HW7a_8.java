package homeworks;
//Write a function which converts the input string to uppercase.
/*public class HW7a_8 {

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }

    public static void main(String[] agrs ) {
        String a = "We are the champions, my friend!";
        System.out.println(MakeUpperCase(a));
}
}*/
//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
// You're given one parameter, the original string. You don't have to worry with strings with less than two characters.

/*public class HW7a_8 {

    public static String remove(String str) {
        return str.substring(1, str.length() -1);
    }

    public static void main(String[] args) {


        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
    }
}*/

//Simple, remove the spaces from the string, then return the resultant string.

/*public class HW7a_8 {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(noSpace("8aaaaa dddd r     "));
        System.out.println(noSpace("jfBm  gk lf8hg  88lbe8 "));
        System.out.println(noSpace("8j aam"));
}}*/

//You're writing code to control your town's traffic lights. You need a function to handle each
//change from green, to yellow, to red, and then to green again.
//Complete the function that takes a string as an argument representing the current state of the
//light and returns a string representing the state the light should change to.
//For example, update_light('green') should return 'yellow'.

/*public class HW7a_8 {

    public static String updateLight(String current) {
        if (current.equals("green")) {
            return "yellow";
        }
        if (current.equals("yellow")) {
            return "red";
        }
        if (current.equals("red")) {
            return "green";
        }
        return "";
            }


    public static void main(String[] args) {
            System.out.println(updateLight("red"));
            System.out.println(updateLight("green"));
            System.out.println(updateLight("yellow"));
        }
}*/

//Write a function called repeat_str which repeats the given string src exactly count times.
//
//repeatStr(6, "I") // "IIIIII"
//repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

public class HW7a_8 {

    public static String repeatStr(final int repeat, final String string) {


        return string.repeat(repeat);
    }


    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(5, ""));
        System.out.println(repeatStr(0, "kata"));
    }
    }