package gr.aueb.cf.cf9.flt_double;

public class EpsilonApp {

    public static void main(String[] args) {
        final double EPSILON = 0.000005;    //6 digits
        double actual = 0.0;
        double expected = 1.0;

        for (int i = 1; i <= 10; i++){
            actual += 0.1;
        }

        if (Math.abs(actual-expected) <= EPSILON) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
    }
}
