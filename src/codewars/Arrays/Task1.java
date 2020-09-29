package codewars.Arrays;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
//It should look like this:
//Sam Harris => S.H
//Patrick Feeney => P.F
        public static String abbrevName(String name){
        (String name){
            String str = "Hi Sergey";
            String[] arr = str.split("e");
            System.out.println(Arrays.toString(arr));
            String name1 = "";
            for (int i = 0; i < name.length(); i++) {
                name1 = name.charAt(0) + "." + name.charAt((name.indexOf(" ") + 1));
            }
            return name1.toUpperCase();
        }}

        public static void main(String[] args) {
            System.out.println(abbrevName("Sam Harris"));
            System.out.println(abbrevName("Patrick Feenan"));
            System.out.println(abbrevName("Evan Cole"));
            System.out.println(abbrevName("P Favuzzi"));
            System.out.println(abbrevName("David Mendieta"));
        }
    }}
