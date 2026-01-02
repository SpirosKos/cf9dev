package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * A method that find the max of an array.
 *
 */

public class FindMax {

    public static void main(String[] args) {

        int arr[] = {2, 5, 20, 30, 50, 1};
        System.out.println(findMax(arr));
    }


    /**
     * Return the max
     * @param arr   Inserted array
     * @return      Returns max
     */
    public static int findMax(int arr[]) {
        return Arrays.stream(arr).max()
                .orElseThrow(() -> new RuntimeException("Array is null"));
    }
}
