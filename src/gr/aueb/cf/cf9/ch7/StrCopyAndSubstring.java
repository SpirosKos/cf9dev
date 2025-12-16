package gr.aueb.cf.cf9.ch7;

/**
 * Αντιγραφή Strings γίνεται με
 * αντιγραφή δεικτών γιατί τα Strings
 * είναι immutable.
 */
public class StrCopyAndSubstring {

    public static void main(String[] args) {

        // Copy
        String s1 = "Coding";
        String s2 = s1;         // Copy

        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);

        // Substring
        String s3 = s1.substring(1);        // oding
        String s4 = s1.substring(1, 3);     // od
    }

    // Traverse char-by-char με substring
    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + " ");
        }
    }

}
