package gr.aueb.cf.cf9.solutions.ch13;

public class StringUtil {

    /**
     * Reverse a string
     * @param str   Inserted String
     * @return      Reversed String
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Capitalize a string
     * @param str   Inserted String
     * @return      Capitalized str
     */
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * Checks if a string isPalindrome
     * @param str   checked String
     * @return      True if isPalindrome else False
     */
    public static boolean isPalindrome(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}
