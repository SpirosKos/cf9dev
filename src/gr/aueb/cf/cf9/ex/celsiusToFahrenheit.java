package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        final double EPSILON = 0.000005;
        Scanner in = new Scanner(System.in);
        double celsius = 0D;
        double fahrenheit = 0D;

        System.out.println("Enter celsius temperature");
        celsius = in.nextDouble();
        System.out.printf("%.4f",sum(celsius));
    }

    public static double sum(double celsius){
        double fahrenheit =0;
        fahrenheit = celsius * (9D/5D) +32;
        return fahrenheit;
    }

}
