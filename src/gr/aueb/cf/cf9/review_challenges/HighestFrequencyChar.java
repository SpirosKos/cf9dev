package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

/**
 * Find a char that is more frequent in a String
 *
 */

public class HighestFrequencyChar {

    public static void main(String[] args) {

        String test = "aaaddddsss";
        System.out.println(frequentChar(test));
    }

    public static char frequentChar(String str) {
        int count[] = new int[128];
        str.chars().forEach(c -> count[c]++);
        int max = Arrays.stream(count).max().getAsInt();

        return (char) str.chars()
                .filter(ch -> count[ch] == max)
                .findFirst()
                .orElseThrow();
    }
}
