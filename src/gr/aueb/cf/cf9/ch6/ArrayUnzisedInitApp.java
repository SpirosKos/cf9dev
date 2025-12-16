package gr.aueb.cf.cf9.ch6;

public class ArrayUnzisedInitApp {
    public static void main(String[] args) {
        int grid [][] = {{1, 2}, {3, 4}, {5, 6}};

        for (int[] row : grid){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
