package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class Filtering {
    public static void main(String[] args) {
        int grades[] = new int[] {4, 9, 9, 8, 7, 2, 1, 4, 10};
        int PASS = 5;

        int[] passed = getPassGrades(grades, PASS);
        for (int pass : passed){
            System.out.print(pass + " ");
        }
    }

    public static int[] getPassGrades(int[] grades, int passThreshold){
        if (grades == null || grades.length == 0) return new int[0]; //empty array

        int count = 0;
        int temp[] = new int[grades.length]; // Worst case: pass

        for (int el : grades){
            if (el >= passThreshold){
                temp[count++] = el;
            }
        }
        return Arrays.copyOf(temp, count); // trim to actual size
    }
}
