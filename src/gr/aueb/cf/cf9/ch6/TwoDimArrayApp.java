package gr.aueb.cf.cf9.ch6;

public class TwoDimArrayApp {
    public static void main(String[] args) {
        int grid[][] = new int[2][2];

        grid[0][0] = 0;
        grid[0][1] = 1;
        grid[1][0] = 2;
        grid[1][1] = 3;

        for (int[] row : grid){
            for (int col : row){
                System.out.print(col + " ");
            }
        }
    }
}
