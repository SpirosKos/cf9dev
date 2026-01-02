package gr.aueb.cf.cf9.review_challenges;

/**
 * Finds the diagonal difference and prints the result
 *
 */

public class DiagonalDiff {

    public static void main(String[] args) {
        int array[][] = {
                {1, 5, 7},
                {2, 7, 9},
                {10, 2, 8}
        };
        System.out.println(diagonalDiff(array));

    }

    public static int diagonalDiff(int arr[][]){
        int firstDiag = 0;
        int secondDiag = 0;
        for (int i =0; i < arr.length; i++) {
            firstDiag += arr[i][i];
            secondDiag += arr[i][arr.length- i - 1];
        }
        return Math.abs(firstDiag - secondDiag);
    }
}
