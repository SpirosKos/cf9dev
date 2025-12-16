package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class Sentinel2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Please insert a num (-1 for exit)");
        //num = in.nextInt();

        while ((num = in.nextInt()) != -1){
            iterations++;
            System.out.println("Please insert a num (-1 for exit)");
            //num = in.nextInt();
        }

        System.out.printf("%d Positive counts", iterations);
    }
}
