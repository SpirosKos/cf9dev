package gr.aueb.cf.cf9.ex;


import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Insert a int number");
        num = in.nextInt();
        System.out.printf("%.2f",square(num));
    }

    public static double square (int a){
        return (a*a);

    }
}
