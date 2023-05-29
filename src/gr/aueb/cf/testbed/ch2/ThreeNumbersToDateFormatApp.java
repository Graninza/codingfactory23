package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 *Λαμβάνει απο τον χρήστη 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος και
 * τους εμφανίζει σε μορφή ΗΗ/ΜΜ/ΕΕ
 */

public class ThreeNumbersToDateFormatApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int yy = 0;

        System.out.println("Please insert day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        yy = year % 100;

        System.out.printf("%d/%d/%d", day, month, yy );
        /**
         * Λύση Ανδρούτσου, μέχρι πριν το yy = year % 100; είναι ίδιο
         */
        System.out.printf("Date is: %02d/%02d/%02d", day, month, year % 100);

    }
}
