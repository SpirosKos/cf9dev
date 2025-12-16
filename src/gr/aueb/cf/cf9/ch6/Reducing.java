package gr.aueb.cf.cf9.ch6;

public class Reducing {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7};
        System.out.println("Total: " + getTotal(arr));
        System.out.printf("Average: %.2f", getAvg(arr));
    }
    public static int getTotal(int[] arr){
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr){
            total += item;
        }
        return total;
    }

    public static double getAvg(int[] arr){
        if (arr == null) return 0;
        int total = 0;
        int avg = 0;
        for (int item : arr){
            total += item;
        }
        return (double) total / arr.length;
    }
}
