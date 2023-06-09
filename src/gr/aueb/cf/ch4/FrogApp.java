package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη
 * θέση Υ (ή σε θέση > Υ). Ο frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump πάει στη θέση 10 + 30 = 40
 * Στο 2ο jump, πάει 40 + 30 = 70
 * Και στο 3ο jump, πάει 70 +30 = 100
 */

public class FrogApp {

////    public static void main(String[] args) {  (Η δική μου λύση)
////        Scanner in = new Scanner(System.in);
////        int X;
////        int Y;
////        int D;
////        int jumps = 0;
////
////        System.out.println("Please provide X, Y and D values");
////        X = in.nextInt();
////        Y = in.nextInt();
////        D = in.nextInt();
////
////        for (int i = X; i < Y; i +=D) {
////            jumps++;
////        }
////
////        System.out.println("Least number of jumps " + jumps );
//
//    }

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Least number of jumps " + jumps );

    }
}
