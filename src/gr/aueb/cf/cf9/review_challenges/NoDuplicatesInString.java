package gr.aueb.cf.cf9.review_challenges;


import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Removes duplicate characters from a given string and returns
 * a new string with unique characters only.
 * * The operation is case-sensitive, and the original relative
 * order of characters is preserved.
 */

public class NoDuplicatesInString {

    public static void main(String[] args) {
        String s1 = "Hello World";

        System.out.println(noDuplicates(s1));
    }

    public static String noDuplicates(String s) {

        //  LinkedHashSet remembers the order
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        s.chars().forEach(ch -> set.add((char) ch));
        set.forEach(sb::append);
        return sb.toString();
    }
}
