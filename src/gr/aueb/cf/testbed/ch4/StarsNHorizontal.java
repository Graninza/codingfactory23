package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει n πλήθος stars,
 * και μετά εκτυπώνει n οριζόντια
 * stars
 *
 */

public class StarsNHorizontal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of stars");
        n = in.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.print("*");
        }

    }
}
