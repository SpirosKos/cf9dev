package gr.aueb.cf.cf9.review_challenges;

/**
 * Gets a string a return the reversed.
 */

public class ReversedString {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s);
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
