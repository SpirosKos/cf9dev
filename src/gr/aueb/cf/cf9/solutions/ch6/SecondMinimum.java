package gr.aueb.cf.cf9.solutions.ch6;

/**
 * It finds the second minimum number in table
 * @author sprs
 * @version 1.0
 */

public class SecondMinimum {

    //declaration of static array
    public static final int arr[] = {200, 20, 40, 90, 100, 1, 1120, 12};

    public static void main(String[] args) {
        //Traverse from left and right and sort the numbers from min -> max using swap method
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j+1]) swap (j, j+1);
            }
        }

        //Prints the result
        System.out.printf("Second Min is: %d ",arr[1]);
    }

    /**
     * Swap positions
     * @param i first position for swap
     * @param j second position for swap
     */
    public static void swap (int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
