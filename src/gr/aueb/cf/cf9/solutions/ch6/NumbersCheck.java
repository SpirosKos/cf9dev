package gr.aueb.cf.cf9.solutions.ch6;

import java.util.Scanner;

public class NumbersCheck {
    public static int arr[] = new int[6];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean hasError;

        do {
            System.out.println("Insert 6 integers from 1 to 49");
            for(int i = 0; i < 6; i++){
                arr[i] = in.nextInt();
                while (arr[i] < 1 || arr[i] > 49){
                    System.out.println("You have to enter between 1-49");
                    arr[i] = in.nextInt();
                }
                System.out.println("Correct Integer for position " + i + " integer " + arr[i]);
            }

            hasError = evenExist(arr) || oddExist(arr) || consecutiveNumbers(arr)
                    || moreThanTwoSameEndings(arr) || moreThanTwoSameTens(arr);

            if (hasError) {
                System.out.println("\n Validation failed! Checking filters...");
                if (evenExist(arr)) System.out.println("  - More than 3 even numbers");
                if (oddExist(arr)) System.out.println("  - More than 3 odd numbers");
                if (consecutiveNumbers(arr)) System.out.println("  - More than 3 consecutive");
                if (moreThanTwoSameEndings(arr)) System.out.println("  - More than 3 same endings");
                if (moreThanTwoSameTens(arr)) System.out.println("  - More than 3 in same tens");
                System.out.println("Please try again.\n");
            } else {
                System.out.println("\n All filters passed! Numbers are valid.");
            }
        }while(hasError);
    }

    /**
     * Check if more than 3 even exist
     * @param arr   array to check
     * @return      true if it exists false if it's not
     */
    public static boolean evenExist(int arr[]) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) count++;
        }
        return count > 3;
    }

    /**
     * Check if more than 3 odds exist
     * @param arr   table
     * @return      true if not are all odds
     */
    public static boolean oddExist(int arr[]){
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 != 0) count++;
            if (count > 3 ) return true;
        }
        return false;
    }

    /**
     * Finds if there are more than 2 consecutive numbers
     * @param arr   table
     * @return  true if consecutive exists
     */

    public static boolean consecutiveNumbers(int arr[]){
        int sorted[] = arr.clone();
        java.util.Arrays.sort(sorted);

        for (int i = 0; i < sorted.length - 2; i++){
            if (sorted[i] == sorted[i+1] - 1 && sorted[i] == sorted[i+2] - 2){
                return true;
            }
        }
        return false;
    }

    /**
     * Method to check if there are more than three same endings
     * @param arr   table
     * @return      true or false depending on the result
     */

    public static boolean moreThanTwoSameEndings(int arr[]){
        if (arr == null) return false;

        int endings[] = new int[10];
        for (int i : arr){
            if (++endings[i % 10] > 3){
                return true;
            }
        }
        return false;
    }

    /**
     * Method to check if there are more than three same tens
     * @param arr   table
     * @return      true or false depending on the result
     */

    public static boolean moreThanTwoSameTens(int arr[]){
        if (arr == null) return false;

        int tens[] = new int[10];
        for (int i : arr){
            if (++tens[i / 10] > 3){
                return true;
            }
        }
        return false;
    }
}
