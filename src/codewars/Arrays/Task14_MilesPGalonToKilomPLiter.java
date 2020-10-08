package codewars.Arrays;

public class Task14_MilesPGalonToKilomPLiter {

    //https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java
//Sometimes, I want to quickly be able to convert miles per imperial gallon into kilometers per liter.
//
//Create an application that will display the number of kilometers per liter (output) based on the number
// of miles per imperial gallon (input).
//
//Make sure to round off the result to two decimal points. If the answer ends with a 0, it should be rounded
//off without the 0. So instead of 5.50, we should get 5.5.
//
//Some useful associations relevant to this kata: 1 Imperial Gallon = 4.54609188 litres 1 Mile = 1.609344 kilometres


    public static float mpgToKPL(final float mpg) {
        float gallonToLiter = 4.54609188f;
        float mileToKilometer = 1.609344f;
        return Math.round(mpg * mileToKilometer / gallonToLiter * 100) / (float) 100;
    }

    public static void main(String[] args) {
        System.out.println(mpgToKPL(10));
        System.out.println(mpgToKPL(20));
        System.out.println(mpgToKPL(30));
    }
}
