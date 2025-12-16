package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n,
 * με μέθοδο. To n! = 1 * 2 * 3 * 4 * ... * n
 * Kαι 0! = 1
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 0;

        // Input data from the user and data binding
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        // Call the service method - delegation
        factorial = facto(num);     // Inject the num real parameter

        // Εκτύπωση αποτελέσματος
        System.out.println("The factorial of " + num + " is " + factorial);
    }

    /**
     * Calculates the factorial of n.
     *
     * @param n     the number to calculate factorial of.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i; // factorial = factorial * i;
        }

        return factorial;
    }
}
