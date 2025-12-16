package gr.aueb.cf.cf9.ch7;

/**
 * Anagrams are strings that have the same characters, but in a different order.
 * For instance, "listen" and "silent" are anagrams.
 */
public class Anagrams {

    public static void main(String[] args) {

    }

    /**
     * Checks if two strings are anagrams.
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] frequency = new int[256];     // full ascii - default value is 0

        for (char c : s1.toCharArray()) {
            frequency[c]++;
        }

        for (char c : s2.toCharArray()) {
            frequency[c]--;
            if (frequency[c] < 0) return false;       // early exit
        }

        // All counts should be 0
        for (int item : frequency) {
            if (item != 0) return false;
        }
        return true;
    }
}
