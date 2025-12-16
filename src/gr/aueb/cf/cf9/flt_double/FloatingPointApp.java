package gr.aueb.cf.cf9.flt_double;

public class FloatingPointApp {
    public static void main(String[] args) {
        final int BITS_PER_BYTE = 8;

        //%.2e scientific notation e.g 1.3e+5 = 1.3 * 10^5. %.2e = 2 δεκαδικα ψηφια
        System.out.printf("Size: %d , Min: %.2e%n , Max: %.2e%n",Float.SIZE * BITS_PER_BYTE, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Size: %d , Min: %.2e%n , Max: %.2e%n",Double.SIZE * BITS_PER_BYTE, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
