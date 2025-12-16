package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        // OR do { Code Block }while(choice != 3);
        while(true) {
            System.out.println("Select one from the below");
            System.out.println("1. Insert Product");
            System.out.println("2. Delete Product");
            System.out.println("3. Exit");
            choice = in.nextInt();
            if (choice == 3) break;
        }

        System.out.println("Thanks for using our app");
    }
}
