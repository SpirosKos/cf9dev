package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

/**
 * This program prints out a menu of 5 options and ask the user for an option between 1-5.
 * If the user inserts a wrong number, there is a loop that keeps asking for the correct options.
 *
 * @author spiros
 * @version 1.0
 */

public class ExerciseOptions {
    public static void main(String[] args) {

        //Declaration of variables
        Scanner scanner = new Scanner(System.in);
        int option = 0;


        //Shows the menu and asks for input
        do {
            //Menu
            System.out.println("Choose one of the options:");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Exit");

            //Input from the user
            option = scanner.nextInt();

            //Validation loop
            while ((option < 1) || (option > 5 )){
                System.out.println("You did not choose correct.Please choose between 1-5");
                option = scanner.nextInt();
            }

            //Prints the users option
            if( option == 1){
                System.out.println("You choose Insert\n");
            } else if (option == 2) {
                System.out.println("You choose Delete\n");
            } else if (option == 3) {
                System.out.println("You choose Update\n");
            } else if (option == 4) {
                System.out.println("You choose Search");
            }
        }while(option != 5);


        //Print final message
        System.out.println("Goodbye");
    }
}