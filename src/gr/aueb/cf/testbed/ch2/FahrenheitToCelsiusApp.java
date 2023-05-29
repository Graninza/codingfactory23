package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 *Μετατρέπει Fahrenheit σε Κελσίου
 * Λαμβάνει από τον χρήστη έναν ακέραιο που
 * συμβολίζει τη θερμοκρασία σε Fahrenheit
 * και τη μετατρέπει σε Κελσίου
 *
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int Fahrenheit = 0;
        int Celsius = 0;

        System.out.println("Παρακαλώ δώστε τη θερμοκρασία Fahrenheit (int)");
        Fahrenheit = in.nextInt();

        Celsius = 5 * (Fahrenheit - 32) / 9;

        System.out.println("Θερμοκρασία σε Κελσίου είναι: " + Celsius);
        /**
         * Λύση Ανδρούτσου, μέχρι το System.out.println("Θερμοκρασία σε Κελσίου είναι: " + Celsius);
         * είναι το ίδιο
         */
        System.out.printf("%d\u00B0F = %d\u00B0C", Fahrenheit, Celsius);
    }
}
