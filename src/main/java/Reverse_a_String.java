import java.util.Scanner;

/* Write a program to take a string as input and output its reverse.
The given code takes a string as input and converts it into a char array, which contains letters of the string as its elements. */

public class Reverse_a_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text...");
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        System.out.println("Result: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
