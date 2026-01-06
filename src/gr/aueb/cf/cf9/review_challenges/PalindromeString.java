package gr.aueb.cf.cf9.review_challenges;

/**
 * Checks if a String is palindrome
 *
 */

public class PalindromeString {

    public static void main(String[] args) {
        String s = "asa";

        System.out.println(isPalindrome(s) ? " String is palindrome" : "String is not palindrome");
    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
