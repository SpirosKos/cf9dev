package gr.aueb.cf.cf9.ex;

import java.util.Scanner;

/**
 * Find the Max between 3 numbers
 *
 * @author spiros
 * @version 1.0
 */

public class Max {
    public static void main(String[] args) {

        //Declarations of variable
        Scanner in = new Scanner(System.in);

        //Asks the user for input and save the variables accordingly
        System.out.print("Insert 3 integers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Prints out the result calling findMax method
        System.out.println("The maximum number is: " + findMax(a, c, c));
        in.close();
    }

    /**
     * Finds the max between 3 numbers calling Math.max()
     * @param a 1st integer
     * @param b 2nd integer
     * @param c 3rd integer
     * @return  the highest value among the three integers
     */
    public static int findMax(int a ,int b, int c){
         int maxA = Math.max(a,b);
         return Math.max(maxA,c);
    }
}
