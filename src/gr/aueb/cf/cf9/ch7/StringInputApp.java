package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StringInputApp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Insert with tabs etc");
        s = sc.next();
        //sc.nextLine();
        System.out.println(s);
    }
}
