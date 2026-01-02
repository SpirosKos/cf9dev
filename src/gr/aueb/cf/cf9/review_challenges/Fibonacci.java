package gr.aueb.cf.cf9.review_challenges;

public class Fibonacci {

    public static void main(String[] args) {
        int i = 10;

        System.out.println(fibonacci(i));
    }

    public static int fibonacci(int n) {
        int e1 = 0;
        int e2 = 1;
        int fibo = 0;

        if (n < 1) throw new IllegalArgumentException("The n cannot be negative");
        for (int i = 2; i < n; i++) {
            fibo = e1 + e2;
            e1 = e2;
            e2 = fibo;
            }
        return fibo;
    }
}
