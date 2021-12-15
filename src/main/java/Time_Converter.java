import java.util.Scanner;

/* You need a program to convert days to seconds.
The given code takes the amount of days as input.
Complete the code to convert it to seconds and output the result. */

public class Time_Converter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days...");
        int days = scanner.nextInt();
        System.out.println(((days * 24) * 60) * 60);
    }
}
