package gr.aueb.cf.cf9.methods;

import java.util.Scanner;

public class FactoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert an int");
        n = in.nextInt();

        System.out.printf("%d! = %d ",n , facto(n));
    }

    public  static int facto(int n){
        int facto = 1;
        for (int i = 1; i <= n; i++){
            facto *= i;
        }
        return facto;
    }
}
