package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα βαθμό από τον χρήστη και
 * ανάλογα τη βαθμολογική κλίμακα εμφανίζει
 * κατάλληλο μήνυμα.
 */
public class GradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από τη βάση");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Ο βαθμός πρέπει να είναι μεταξύ 1-10");
                break;
        }
    }
}
