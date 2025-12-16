package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Number of starts");
        n = in.nextInt();

        for (int i = 1; i <= n; n-- ) {
            for (int j = 1; j <=n; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
