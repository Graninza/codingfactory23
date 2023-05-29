package gr.aueb.cf.testbed.ch5;

import java.util.Scanner;

/**
 *Εμφανίζει ένα μενού 6 επιλογών
 * 1.Εμφάνισε n αστεράκια οριζόντια
 * 2.Εμφάνισε n αστεράκια κάθετα
 * 3.Εμφάνισε n γραμμές με n αστεράκια
 * 4.Εμφάνισε n γραμμές με αστεράκια 1–n
 * 5.Εμφάνισε n γραμμές με αστεράκια n–1
 * 6.Έξοδος από το πρόγραμμα
 * και ζητά από τον χρήστη να κάνει μια επιλογή.
 * Στη συνέχεια ζητά από τον χρήστη να δώσει αριθμό για αστεράκια
 * και τα εμφανίζει ανάλογα με την επιλογή που έχει κάνει αρχικά
 */

public class MenuStarsApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            printMenu();
            choice = getNextInt("Επιλέξτε ένα από τα παραπάνω");
            if (isChoiceInvalid(choice)) {
                System.out.println("Λάθος επιλογή. Επιλέξτε ξανά");
                continue;
            }
            if (isChoiceQuit(choice)) {
                System.out.println("Έξοδος από το πρόγραμμα");
                break;
            }

            onChoiceGetResult(choice);

        }  while (true);

    }

    public static int getNextInt(String message){
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice){
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1–n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n–1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static void onChoiceGetResult(int choice) {
        int n = 0;
        System.out.println("Δώστε αριθμό για αστεράκια");
        n = in.nextInt();

        switch (choice) {
            case 1:
                horizontal(n);
                break;
            case 2:
                vertical(n);
                break;
            case 3:
                grid(n);
                break;
            case 4:
                ascending(n);
                break;
            case 5:
                descending(n);
                break;
            case 6:
            default:
                break;
        }
        return;
    }

    public static void horizontal(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }
    }

    public static void vertical(int n){
        for (int i = 1; i <=n; i++) {
            System.out.println("*");
        }
    }

    public static void grid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ascending(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  descending (int n){
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





}
