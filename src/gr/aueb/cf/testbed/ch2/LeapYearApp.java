package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 * Ζητά απο τον χρήστη να δώσει ενα έτος (ακέραιος),
 * κάνει την επεξεργασία και εμφανίζει αν το συγκεκριμένο
 * έτος είναι δίσεκτο ή όχι.
 *
 *
 *  * Λύση Ανδρούτσου
 *  * αποφασίζει αν έτος είναι δίσεκτο (leap year),
 *  * όπου δίσεκτο σημαίνει το έτος να διαιρείται με το 4,
 *  * να μη διαιρείται με το 100, και να διαιρείται με το 100
 *  * να διαιρείται και με το 400
 *  *
 *  * public class LeapYearApp {
 *  *     public static void main(String[] args) {
 *  *         Scanner in = new Scanner(System.in);
 *  *         int year;
 *  *         boolean isLeap = false;
 *  *
 *  *         System.out.println("Παρακαλώ δώστε έτος (int)");
 *  *         year = in.nextInt();
 *  *
 *  *         isLeap = year % 4 == 0 && (year % 100 !=0 || year %400 == 0);
 *  *
 *  *         if (year % 4 == 0){
 *  *           if (year % 100 !=0){
 *  *               isLeap = true;
 *  *           } else if (year % 400 == 0) {
 *            isLeap = true;
 */

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;

        System.out.println("Παρακαλώ δώστε έτος: ");
        year = in.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Το συγκεκριμένο έτος είναι δίσεκτο");
        else
            System.out.println("Το συγκεκριμένο έτος δεν είναι δίσεκτο");
    }
}


