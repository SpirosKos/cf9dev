package gr.aueb.cf.cf9.ch6;

public class ArrayMinApp {
    public static void main(String[] args) {
        int arr[] = {20, 7, 10, 12, 15};
        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
        System.out.printf("Min value: %d, Min position %d:", minValue, minPosition);
    }
}
