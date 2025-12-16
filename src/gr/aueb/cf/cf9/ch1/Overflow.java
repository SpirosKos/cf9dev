package gr.aueb.cf.cf9.ch1;

/**
 * Προσθέτει 2 αριθμούς num1 + num2 και αποθηκεύει το αποτέλεσμα στην μεταβλητή sum.
 */
public class Overflow {
    /**
     * Εκτυπώνει το αποτέλεσμα της πράξης.
     * @param args δεν χρησιμοποιουνται
     */
    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 20;
        int sum = 0;
        sum = num1 + num2;
        System.out.printf("Το αποτέλεσμα της πρόσθεσης είναι ίσο με %d.",sum);
    }
}
