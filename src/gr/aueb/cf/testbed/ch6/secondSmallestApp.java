package gr.aueb.cf.testbed.ch6;

/**
 * Εφαρμογή που βρίσκει το 2ο μικρότερο στοιχείο ενός πίνακα
 */

public class secondSmallestApp {
    public static void main(String args[]){
        int arr[] = {22, 13, 21, 11, 33, 45};
        int n = arr.length;
        System.out.println("To 2o μικρότερο στοιχείο του πίνακα είναι το:" + secSmallest(arr, n));
    }


    static int secSmallest(int arr[], int n){
        int smallest = arr[0];
        for (int i=0; i < n; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
        }

        int sec_smallest = Integer.MAX_VALUE;

        for (int i=0; i < n; i++){
            if(arr[i] != smallest && arr[i] < sec_smallest)
                sec_smallest = arr[i];
        }

        return sec_smallest;

    }
}
