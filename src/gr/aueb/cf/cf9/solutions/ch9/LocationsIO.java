package gr.aueb.cf.cf9.solutions.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LocationsIO {
    public static void main(String[] args) {

        Path source = Path.of("/Users/g0ld3/Desktop/Coding Factory/Java/ch9/solutions/locations.txt");
        Path target = Path.of("/Users/g0ld3/Desktop/Coding Factory/Java/ch9/solutions/locations-out.txt");
        String geoLocations[][];

        try {
            geoLocations = getLocations(source);
            //writeToLocations(target);

            for (String[] geoDatum : geoLocations) {
                for (String part : geoDatum) {
//                    System.out.print(part + " ");
//                    System.out.printf("{location:'%s', latitude: %s, longitude: %s}",
//                            geoDatum[0], geoDatum[1], geoDatum[2]);
                }
                System.out.printf("{location:'%s', latitude: %s, longitude: %s}\n",
                        geoDatum[0], geoDatum[1], geoDatum[2]);
            }

        }catch (IOException e){
            System.err.println("There is an error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String[][] getLocations(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path,StandardCharsets.UTF_8);

        if (!lines.isEmpty()){
            lines.removeFirst();
        }
        String returnArray[][] = new String[lines.size()][];
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] parts = line.split(",");
            returnArray[i] = parts;
        }

        return returnArray;
    }
    public static void writeToLocations(Path path,String arr[][]){
//        Files.write(path,arr[][]);
    }

}