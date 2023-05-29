package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

/**
 * Εκτυπώνει n,9,..1
 * αστεράκια σε κάθε γραμμή
 * ξεκινώντας από τη n γραμμή
 */

public class StarsNDesc {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Please insert number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
