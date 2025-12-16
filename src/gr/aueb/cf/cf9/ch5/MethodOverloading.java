package gr.aueb.cf.cf9.ch5;

/**
 * Demo του method overloading.
 * Overload = ίδιο όνομα μεθόδου, διαφορετικές παράμετροι
 * method signature => όνομα + παράμετροι
 */
public class MethodOverloading {

    public static void main(String[] args) {
        int sum1 = 0;
        long sum2 = 0L;
        int sum3 = 0;

        sum1 = MethodOverloading.add(10, 20);
        sum2 = add(10L, 20L);
        sum3 = add(10, 20, 30);

        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Overloaded method
    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    // Overloaded method
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
