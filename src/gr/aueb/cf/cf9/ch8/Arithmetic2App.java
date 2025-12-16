package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Please enter two numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            result = num1 / num2;
            System.out.println();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            // return;
        }

        System.out.println("Result = " + result + "");  // This line will be executed
    }
}
