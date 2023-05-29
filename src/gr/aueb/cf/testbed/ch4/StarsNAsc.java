package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει σε αύξουσα σειρά
 * 1, 2, 3,..,n αστεράκια σε
 * κάθε γραμμή
 */

public class StarsNAsc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
