package gr.aueb.cf.cf9.review_challenges;

import java.util.Arrays;

public class LeftRotation {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int offset = 2;

        System.out.println(Arrays.toString(rotateByLeft(arr,offset)));
    }

    public static int[] rotateByLeft(int arr[], int offset){
        int tmp[] = new int[arr.length];

        for (int i =0; i < arr.length ; i++) {
            tmp[i] = arr[(i + offset) % arr.length];
        }
        return tmp;
    }
}
