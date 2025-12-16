package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Insert an int");
        num = in.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int a){
        return a % 2 != 0;
    }
}
