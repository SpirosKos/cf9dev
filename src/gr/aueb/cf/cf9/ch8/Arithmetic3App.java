package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic3App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
            System.out.println("Παρακαλώ εισάγετε δύο ακεραίους (0 για έξοδο)");
            num1 = scanner.nextInt();
            if (num1 == 0) break;

            num2 = scanner.nextInt();

            // Validation αντί για try catch, state-test
            if (num2 == 0) {
                System.out.println("Ο παρονομαστής δεν μπορεί να είναι μηδέν");
                continue;
            }

            result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }
}
