package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;
/**
 * Program that convert Fahrenheit to Celsius
 */
public class FahrenheitCelsius {
    public static void main(String[] args) {

        //Declarations
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;

        //Asking for input from user
        System.out.println("How many Fahrenheits is today?");
        fahrenheit = in.nextInt();

        //Prints result
        System.out.printf("The convert to Celsius is : %d Celsius",(5*(fahrenheit-32)/9));
    }
}
