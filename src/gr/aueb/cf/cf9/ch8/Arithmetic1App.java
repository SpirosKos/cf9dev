package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * Δημιουργείται ένα {@link ArithmeticException} χωρίς
 * να το χειριστούμε.
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        //result = num1 / num2;       // Αν το num2 == 0 θα δώσει ArithmeticException
        result = div(num1, num2);
        System.out.println("Result: " + result);        // Δεν εκτελείται αυτή η γραμμή
    }

    public static int div(int num1, int num2)  {
        return num1 / num2;
    }
}
