package gr.aueb.cf.cf9.ch3;

/**
 * Δίνουμε αρχική τιμή, τελική τιμή και βήμα αύξησης
 * και υπολογίζει το πλήθος των επαναλήψεων
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        int i = 1;          // local scope, local variable
        int endVal = 10;

        while (i <= endVal) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Επαναλήψεις / Loops / Iterations: " + (i - 1));
    }
}
