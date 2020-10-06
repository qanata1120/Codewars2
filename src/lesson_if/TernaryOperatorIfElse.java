package lesson_if;

public class TernaryOperatorIfElse {

    public static void main(String[] args) {
        int time = 11;
        if (time > 12) {
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);
        } else {
            String result1 = (time < 10) ? "Good Morning." : "Good Day/";
            System.out.println(result1);
        }

    }
}
