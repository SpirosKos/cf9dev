package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Given 5 positive integers, calculate the following:
 *
 * 1. The minimum sum of 4 out of the 5 numbers (summing the 4 smallest integers).
 * 2. The maximum sum of 4 out of the 5 numbers (summing the 4 largest integers).
 *
 * Example:
 * Input: [1, 3, 5, 7, 9]
 * Minimum Sum: 1 + 3 + 5 + 7 = 16
 * Maximum Sum: 3 + 5 + 7 + 9 = 24
 * Output: 16 24
 *
 * Hint: Exclude exactly one element to find each sum (regardless of duplicates).
 */

public class MinMaxSum {

    public static void main(String[] args) {
        int numbers[] = {1, 3, 5, 7, 9};

        minMaxSum(numbers);
    }

    public static void minMaxSum(int num[]) {
        int min = Arrays.stream(num).min().orElse(0);
        int max = Arrays.stream(num).max().orElse(0);

        int sum = Arrays.stream(num).sum();
        System.out.println("Min : " + (sum - max) + " Max: " +(sum - min));
    }
}
