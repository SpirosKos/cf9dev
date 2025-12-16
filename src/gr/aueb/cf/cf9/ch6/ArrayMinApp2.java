package gr.aueb.cf.cf9.ch6;

public class ArrayMinApp2 {
    public static void main(String[] args) {
        int arr[] = {20, 30, 10, 12, 15};
        int minValue = Integer.MAX_VALUE;
        System.out.println(minValue);
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        System.out.printf("Min value: %d, Min position %d:", minValue, minPosition);
    }
}
