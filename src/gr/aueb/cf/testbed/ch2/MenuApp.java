package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού
 * επιλογών μέχρι ο χρήστης να επιλέξει
 * τον αριθμό 5. Για τις επιλογές 1-4 δίνει
 * το αντίστοιχο feedback. Επίσης θα ελέγχει
 * αν ο χρήστης δίνει αριθμό <0 ή >5.
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.flush();
            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Έξοδος");
            } else {
                System.out.println("Δώστε έναν αριθμό από το 1 έως το 5");
            }

        } while (choice != 5);
    }
}
