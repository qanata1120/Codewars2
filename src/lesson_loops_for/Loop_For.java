package lesson_loops_for;

public class Loop_For {

    //When you know exactly how many times you want to loop through a block of code,
    // use the for loop instead of a while loop:

    // for (statement 1; statement 2; statement 3) {
    // code block to be executed }
    // Statement 1 is executed (one time) before the execution of the code block.
    //Statement 2 defines the condition for executing the code block.
    //Statement 3 is executed (every time) after the code block has been executed.

    //To print even values between 0 and 10:
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}
