package gr.aueb.cf.ch6;

public class MissingArrayElement {

    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 2};
        int missing = getMissing(arr);
        System.out.println("The missing element is: " + missing);

    }

    public static int getMissing(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = min; i <= max; i++){
            boolean found = false;
            for (int j = 0; j < arr.length; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found){
                return i;
            }
        }
        return -1; // return -1 if no missing number is found
    }
}
