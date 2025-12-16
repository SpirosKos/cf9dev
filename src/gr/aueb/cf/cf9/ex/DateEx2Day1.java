package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

/**
 * Program that gets input for date/month/year and prints it
 */
public class DateEx2Day1 {
    public static void main(String[] args) {

        //Declaration
        Scanner in = new Scanner(System.in);
        int day = 0, month = 0, year = 0;

        //Input
        System.out.println("Enter the  date day/month/year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        //Result
        System.out.printf("%02d/%d/%d",day,month,(year%2000));
    }
}
