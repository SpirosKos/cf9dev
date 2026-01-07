package gr.aueb.cf.cf9.review_challenges;


import java.util.Arrays;

/**
 * Tracks and counts how many times a player breaks their highest and lowest score records.
 * * Logic:
 * The first game sets the initial high and low records.
 * For each subsequent game, if the score is strictly greater than the current high,
 * the 'best' record count increases.
 * -If the score is strictly lower than the current low,
 * the 'worst' record count increases.
 */

public class Scores {

    public static void main(String[] args) {
        int arr[] = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        System.out.println("Final Result : " + Arrays.toString(getMaxMinScoreCounts(arr)));
    }

    public static int[] getMaxMinScoreCounts(int arr[]) {
        int minC = 0;
        int maxC = 0;
        int minScore = arr[0];
        int maxScore = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minScore) {
                minScore = arr[i];
                minC++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxScore) {
                maxScore = arr[i];
                maxC++;
            }

        }
        return new int[]{maxC, minC};
    }
}

