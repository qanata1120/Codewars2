package lesson_loops_for;

public class Loop_For_Each {

    //For-each loop, which is used exclusively to loop through elements in an array:
    //syntaxis:
    //for (type variableName : arrayName) {code block to be executed}

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
        System.out.println(i);
    }
}}
