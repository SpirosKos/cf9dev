package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class EligibleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEligible = false;
        final int VOTING_AGE = 18;
        int age = 0;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible : " + isEligible);
    }
}
