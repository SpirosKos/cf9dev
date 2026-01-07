package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

public class SameCharsDiffOrder {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagrams(s1,s2) ? "Strings are anagrams" : "Strings are not anagrams");
    }

    public static boolean isAnagrams(String s1, String s2) {

        // (O(n log n))
//        return Arrays.equals(s1.chars().sorted().toArray(),s2.chars().sorted().toArray());

        // (O(1))
        if (s1.length() != s2.length()) return false;

        int[] frequency = new int[128]; // Covers  ASCII characters

        // Anagrams require equal character frequencies, not just existence.
        for (char c : s1.toCharArray()) frequency[c]++;
        for (char c : s2.toCharArray()) {
            if (--frequency[c] < 0) return false;   // pre-decrement: -- first
        }
        return true;
    }
}
