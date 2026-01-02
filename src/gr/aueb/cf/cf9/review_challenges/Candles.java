package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Give an Array with height of candles
 * returns the number of the highest
 */

public class Candles {

    public static void main(String[] args) {
        int arr[] = {4, 2, 3, 4, 4, 6};

        System.out.println(candlesCount(arr));

    }

    public static long candlesCount(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        return Arrays.stream(arr).filter(c -> c == max).count();
    }
}
