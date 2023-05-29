package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές double από τον χρήστη, τις
 * a, b, c όπου α είναι η υποτείνουσα και
 *  b, c οι δυο πλευρές.
 *  Ελέγχει αν το τρίγωνο είναι ορθογώνιο,
 *  δηλ. a^2 == b^2 + c^2
 *  Έστω ότι EPSILON = 0.000005
 */

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Παρακαλώ δώστε το μήκος της υποτείνουσας και των δυο πλευρών του τριγώνου");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON ) {
            System.out.println("Ορθογώνιο");
        } else {
            System.out.println("Όχι Ορθογώνιο");
        }



    }
}
