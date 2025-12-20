package gr.aueb.cf.cf9.solutions.ch13;

public class MathHelper {

    private MathHelper(){

    }

    /**
     * Finds out the max in an Array
     * @param arr   Int Array
     * @return      Max number
     */
    public static double maxInt(int arr[]){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }

        double maxInt = Double.MIN_VALUE;
        for (double number : arr){
            if (number > maxInt) maxInt = number;
        }
        return maxInt;
    }

    /**
     * Finds out the minimum in an Array
     * @param arr   Int Array
     * @return      Min number
     */
    public static double minInt(int arr[]){

        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }
        double minInt = Double.MAX_VALUE;
        for (double number : arr){
            if (number < minInt) minInt = number;
        }
        return minInt;
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
