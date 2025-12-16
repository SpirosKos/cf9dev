package gr.aueb.cf.cf9.solutions.ch6;

public class ex1 {

    public static int getMinPosition(int arr[], int low, int high){
        int minPosition = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1)){
            System.out.println("Error in array dimensions");
            return -1;
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int arr[], int low, int high){
        int maxPosition = low;
        int maxValue;

        if ((maxPosition < 0 ) || (high > arr.length)) {
            return -1;
        }

        maxValue = arr[maxPosition];
        for (int i = 1; i <= high ; i++){
            if (arr[i] > maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;

    }

    static void main() {
        int arr [] = {3, 50, 10, 15, 22};
        int maxPosition = 0;

        maxPosition = getMaxPosition(arr, maxPosition, arr.length - 1);

        System.out.printf("MaxPosition is %d", maxPosition);


    }
}
