package gr.aueb.cf.cf9.solutions.ch10;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * Gets numbers from 1-49 from another file, test for combos of 6 and if it passes the checks writes them in the new
 * output txt.
 * @author sprs5
 * @version 1.0
 * */

public class ProjectFirst {
    public static void main(String[] args) {

        // Declaration of input, output paths
        Path source = Path.of("C:/Users/sprs5/Desktop/Coding Factory/Coding Factory/Java/ch10/int.txt");
        Path output = Path.of("C:/Users/sprs5/Desktop/Coding Factory/Coding Factory/Java/ch10/int_output.txt");

        // Returns the combos and write them in a new file,Opens the file and Append the combos
        try {
            int[] arr = getNumbers(source);

            // Overwrite if there is an exist file and writes the combos
            try (BufferedWriter writer = Files.newBufferedWriter(output,StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE)){
                getCombinations(arr, 6, writer);
            }
        } catch (IOException e) {
        System.err.println("Error" + e.getMessage());
        }


    }

    /**
     * Get the numbers and sort them
     * @param path  input file
     * @return      sorted array
     * @throws IOException  if text is null
     */
    public static int[] getNumbers(Path path) throws IOException {
        List<String> line = Files.readAllLines(path);
        if (line.isEmpty()){
            return new int[0];
        }

        int[] arr = new int[line.size()];

        for (int i = 0; i < line.size(); i++){
            arr[i] = Integer.parseInt(line.get(i));
        }
        Arrays.sort(arr);
        return arr;
    }

    /**
     * Writes the combinations in output file
     * @param arr       combinations array
     * @param writer    write to output
     * @throws IOException  checks if its null
     */
    public static void getOutput(int[] arr, BufferedWriter writer) throws  IOException{
            writer.write(Arrays.toString(arr));
            writer.newLine();
            System.out.println("Write the combination of: " + Arrays.toString(arr));
    }

    /**
     * Gets combinations of 6s
     * @param arr       sorted array
     * @param combos    number of combination numbers
     * @param writer    writes to new output
     * @throws IOException  if there is an exception
     */
    public static void getCombinations(int[] arr, int combos, BufferedWriter writer) throws IOException{
        int[] row = new int[combos];
        int size = arr.length;
        for (int i = 0; i <= size - 6 ; i++) {
            for (int j = i + 1; j <= size - 5; j++) {
                for (int z = j + 1; z <= size - 4; z++) {
                    for (int l = z + 1; l <= size - 3; l++) {
                        for (int k = l + 1; k <= size - 2; k++) {
                            for (int m = k + 1; m <= size - 1; m++) {
                                row[0] = arr[i];
                                row[1] = arr[j];
                                row[2] = arr[z];
                                row[3] = arr[l];
                                row[4] = arr[k];
                                row[5] = arr[m];
                                if (isEven(row) && isOdd(row) && isConsecutive(row) && sameEnding(row,3) && sameTen(row, 3))
                                    getOutput(row,writer);

                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks if there are more than 4 evens
     * @param arr   combination arr
     * @return      True if 4<=
     */
    public static boolean isEven(int[] arr){
        int count = 0;
        for (int el : arr){
            if (el % 2 == 0 )count++;
        }
        return count <= 4;
    }

    /**
     * Checks if there are more than 4 odds
     * @param arr   combination arr
     * @return      True if 4<=
     */
    public static boolean isOdd(int[] arr){
        int count = 0;
        for (int el : arr){
            if (el % 2 != 0 )count++;
        }
        return count <= 4;
    }

    /**
     * Check for consecutive numbers
     * @param arr   combination arr
     * @return      If 2<= True
     */
    public static boolean isConsecutive(int arr[]) {
        int consecutiveCount = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if there are similar numbers
     * @param arr           combination arr
     * @param threshold     amount of consecutive numbers
     * @return              True if 3<=
     */
    public static boolean sameEnding(int arr[], int threshold){
        int endings[] = new int[10];

        for (int el : arr){
            endings[el % 10]++;
        }
        return Arrays.stream(endings).noneMatch(e -> e >= threshold);
    }

    /**
     * Checks if there are same ten numbers
     * @param arr           combination arr
     * @param threshold     amount of same ten numbers
     * @return              True if 3<=
     */
    public static boolean sameTen(int[] arr, int threshold) {
        int[] ten = new int[5];

        for (int num : arr) {
            ten[num/10]++;
        }

        return Arrays.stream(ten).noneMatch(t -> t >= threshold);
    }

}
