package gr.aueb.cf.cf9.ch6;

public class ArrayMinGenericMethodApp {

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

    public static void main(String[] args) {
        int grades[] = {4, 8, 10, 3, 6, 2, 20, 4};
        int minPosition = 0;

        minPosition = getMinPosition(grades, 0, grades.length - 1);

        //Correction in minPosition(+1) to be user friendly
        System.out.printf("Min Value: %d, Min position: %d", grades[minPosition], minPosition + 1 );
    }
}
