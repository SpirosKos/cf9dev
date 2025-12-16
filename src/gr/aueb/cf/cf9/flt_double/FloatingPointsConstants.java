package gr.aueb.cf.cf9.flt_double;

import java.util.Scanner;

public class FloatingPointsConstants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result =0d;
        double remaining = 0.0;

        System.out.println("Please enter two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        result = num1/ num2;
        remaining = num1 % num2;

        System.out.printf("Div: %08.2f\n", result);
        System.out.printf("Mod: %08.2f", remaining);
    }
}
