package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

/**
 * Shows 10 stars horizontal,
 * 1 star 10 times
 */
public class Stars10App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Insert number of iterations");
        n = in.nextInt();

        while (i <= n ) {
            System.out.print("*");
            i++;
        }
    }
}
