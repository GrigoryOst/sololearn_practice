import java.util.Scanner;

/* You take a loan from a friend and need to calculate how much you will owe him after 3 months.
You are going to pay him back 10% of the remaining loan amount each month.
Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months. */

public class Loan_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter the amount...");
        int amount = scanner.nextInt();
        for (int i = 0; i < 3; i++) {                       //первый вариант
            amount -= amount * 0.1f;
        } System.out.println ("Remaining amount due: " + amount);*/

        System.out.println("Enter the amount...");
        int amount = scanner.nextInt();
        System.out.println("Enter the amount of months...");
        int month = scanner.nextInt();                      // второй вариант
        for (int i = 0; i < month; i++) {
            amount -= amount * 0.1f;
        } System.out.println ("Remaining amount due: " + amount);
    }
}
