package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζει δύο μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου
 * αν είναι άρτιος ή περιττός.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        isEven = isEven(num);

        if (isEven) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
//        return num % 2 != 0;
        return !isEven(num);
    }
}
