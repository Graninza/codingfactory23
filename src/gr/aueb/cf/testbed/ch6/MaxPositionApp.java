package gr.aueb.cf.testbed.ch6;

/**
 * Εφαρμογή που επιστρέφει τη θέση στον
 * πίνακα arr του μέγιστου στοιχείου του πίνακα
 */

public class MaxPositionApp {

    public static void main (String[] args){

        int arr[] = {15, 33, 20, 56, 77, 80, 44};
        int n = arr.length;
        System.out.println("Η θέση του μέγιστου στοιχείου του πίνακα βρίσκεται στην θέση "+
                getMaxPosition(arr, 0, n-1));
    }

    static int getMaxPosition(int arr[], int low, int high) {
        int maxValue = arr[low];
        int maxPosition= 0;
        int i;

        for (i = low; i <= high; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxPosition = i;
            }

        }
        return maxPosition;
    }

}
