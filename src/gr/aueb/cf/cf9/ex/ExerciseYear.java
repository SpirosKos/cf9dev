package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

/**
 * This program asks the user to enter a year(integer type) and checks if it's a leap year or no
 *
 * @author spiros
 * @version 1.0
 */

public class ExerciseYear {
    public static void main(String[] args) {

        //Declaration
        Scanner scanner = new Scanner(System.in);
        int year = 0;

        //Asks the user for input
        System.out.println("Please enter year: ");
        year = scanner.nextInt();

        //Calculates and gives the result
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0)) {
            System.out.printf("%d it's a leap year.",year);
        }
        else {
            System.out.printf("%d it's not a leap year.",year);
        }

    }
}
