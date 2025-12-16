package gr.aueb.cf.cf9.ch1;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it raining (true/false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert temperature (int)");
        temp = in.nextInt();
        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
