package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class TernaryPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Please insert a num");
        num1 = in.nextInt();

        System.out.printf("Abs of %d is: %d", num1, (num1 > 0 ) ? num1 : -num1);
    }
}
