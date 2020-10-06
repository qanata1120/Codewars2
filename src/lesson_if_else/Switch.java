package lesson_if_else;

public class Switch {

    //Switch
    //The switch expression is evaluated once.
    //The value of the expression is compared with the values of each case.
    //If there is a match, the associated block of code is executed.
    //The break and default keywords are optional, and will be described later in this chapter
    //The example below uses the weekday number to calculate the weekday name:
    //The default keyword specifies some code to run if there is no case match:

    public static void main(String[] args) {
        int day = 8;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Happy people don't have a watch");
        }
    }
}


