package gr.aueb.cf.cf9.solutions.ch6;

import java.util.Arrays;

/**
 * Different kind of methods with tables,description in every method
 *
 * @author sprs5
 * @version 1.0
 */

public class Methods {

    //declaration of final static table
    public static final int arr[] = {30, 50, 14, 10, 20, 22};

    public static void main(String[] args) {

        //declaration
        int num = 0;

        //checks all the methods simple tests

        num = arrayPosition(arr, 10);
        System.out.println("Exist in position: "  + num);
        evenNumbers(arr);
        System.out.println("Doubles" + Arrays.toString(multiplyArray(arr)));
        System.out.println(evenExist(arr));
        System.out.println(allEven(arr));
    }

    /**
     * Search for a number in array and prints the position if it exists
     * @param arr   table
     * @param elem  number to search for
     * @return  position
     */
    public static int arrayPosition(int arr[], int elem) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Check if all numbers are even
     * @param arr   table
     * @return      true if all are even
     */
    public static boolean allEven(int arr[]){
        for (int elem : arr){
            if (elem % 2 != 0) return false;
        }
        return true;
    }

    /**
     * Check if an even exist
     * @param arr   array to check
     * @return      true if it exists false if it's not
     */
    public static boolean evenExist(int arr[]) {
        int count = 0;
        for (int elem : arr) {
            if (elem % 2 == 0) {
                count++;
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gives the double of every array element
     * @param arr   Incoming array
     * @return      New table
     */
    public static int[] multiplyArray(int arr[]){
        if (arr == null || arr.length == 0) return new int[0];

        int mapped[] = new int[arr.length];

        for (int elem = 0; elem < arr.length; elem++){
            mapped[elem] = arr[elem] * 2;
        }

        return mapped;
    }

    /**
     * Print only even numbers
     * @param arr   array with numbers
     */
    public static void evenNumbers(int arr[]) {
        if (arr == null || arr.length == 0) System.out.println("There are no evens");
        else {for (int i : arr) {
                if (i % 2 == 0) {
                    System.out.println("Even number:" + i);
                }
            }
        }
    }
}