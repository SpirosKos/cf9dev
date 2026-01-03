package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * User insert an array of number positive,negative or zeros
 *
 * Calculates how much each of them are inside the array
 * and prints the amount divided by the length of the array
 * Example :
 * int arr[] = {1, -2, 0, 3, 0, -4};
 *
 * Output:
 * 0.333333  // Positive (2/6)
 *
 */

public class Frequencies {

    public static void main(String[] args) {
        int arr[] = {1, -2, 0, 3, 0, -4};

        printFrequencies(arr);
    }

    public static void printFrequencies(int arr[]) {
        double positive = Arrays.stream(arr)
                .filter(num -> num > 0)
                .count();
        System.out.printf( " %.6f \n" ,positive / arr.length);

        double negative = Arrays.stream(arr)
                .filter(num -> num < 0)
                .count();
        System.out.printf( " %.6f \n" ,negative / arr.length);

        double zeros = Arrays.stream(arr)
                .filter(num -> num == 0)
                        .count();
        System.out.printf( " %.6f " ,zeros / arr.length);

//                          OR
//
//        System.out.printf(" %.6f", Arrays.stream(arr)
//                .filter(num -> num > 0)
//                .count() / (double) arr.length);
//
//        System.out.printf(" %.6f", Arrays.stream(arr)
//                .filter(num -> num < 0)
//                .count() / (double) arr.length);
//
//        System.out.printf(" %.6f", Arrays.stream(arr)
//                .filter(num -> num == 0)
//                .count() / (double) arr.length);

    }
}
