package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int positivesCount = 0;

        System.out.println("Please give me a num (int)");
        num = in.nextInt();
        while (num >= 0){
            positivesCount++;
            System.out.println("Please give me a num (int)");
            num = in.nextInt();
        }
        System.out.printf(" %d Positive-count. ",positivesCount);
    }
}
