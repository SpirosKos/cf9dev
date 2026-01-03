package gr.aueb.cf.cf9.review_challenges;


/**
 * Finds the prime numbers
 *
 */

public class FindPrime {

    public static void main(String[] args) {

        System.out.println(isPrime(20));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i ++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
