package gr.aueb.cf.cf9.ch5;

/**
 * Υπολογίζει το παραγοντικό του n
 * με αναδρομικό τρόπο.
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {
        int result = 0;

        result = facto(5);

        System.out.println("The factorial of 5 is: " + result);
    }

    public static int facto(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n * facto(n - 1);
        return n <= 1 ? 1 : n * facto(n - 1);       //
    }
}
