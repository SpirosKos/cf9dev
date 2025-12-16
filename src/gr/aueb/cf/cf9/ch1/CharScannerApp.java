package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';

        inputChar = in.nextLine().charAt(3);

        System.out.println("Input char: " + inputChar);
    }
}
