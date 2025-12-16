package gr.aueb.cf.cf9.ch1;

import java.io.IOException;

public class CharInputApp {

    public static void main(String[] args) throws IOException {
        int inputChar = ' '; //' ' returns the ordinal value of the car

        System.out.println("Please insert an ASCII char");
        inputChar = System.in.read();   // reads one byte as int

        System.out.println("char: " +  (char) inputChar);
    }
}
