package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

/**
 * Scanner demo reads 2 ints from input(keyboard) and prints the sum
 */
public class ScannerApp {
    public static void main(String[] args) {
        //Declaration
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        //Commands
        System.out.println("Please insert 2 ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum );
    }
}
