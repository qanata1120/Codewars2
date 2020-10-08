package codewars.Arrays;

import java.util.Arrays;

public class Task1_Abbreviation {

        //Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
//It should look like this:
//Sam Harris => S.H
//Patrick Feeney => P.F
        public static String abbrevName(String name){

            String[] arr = name.split(" ");
            // System.out.println(Arrays.toString(arr));

            String nameAbbreviated = " ";
            int i = 0;
            while (i < arr.length) {
                nameAbbreviated += arr[i].charAt(0) + ".";
                i++;
            }
            return nameAbbreviated.toUpperCase();
        }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("David Mendieta"));
    }
}
