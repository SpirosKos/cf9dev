package gr.aueb.cf.cf9.solutions.ch13;

import java.util.Arrays;

public class MathHelper {

    private MathHelper(){

    }

    /**
     * Finds out the max in an Array
     * @param arr   Int Array
     * @return      Max number
     */
    public static int maxInt(int arr[]){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        return max;
    }

    /**
     * Finds out the minimum in an Array
     * @param arr   Int Array
     * @return      Min number
     */
    public static int minimumInt(int arr[]){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }

        Arrays.sort(arr);
        int min = arr[0];
        return min;
    }

    /**
     * Finds out the average of an array
     * @param arr   Int Array
     * @return      Average number
     */

    public static double averageInt(int arr[]){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }
        double sum = 0;
        for (int elem : arr){
            sum += elem;
        }
        return sum / arr.length;
    }
}
