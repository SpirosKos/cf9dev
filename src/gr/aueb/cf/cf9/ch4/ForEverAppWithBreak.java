package gr.aueb.cf.cf9.ch4;

public class ForEverAppWithBreak {

    public static void main(String[] args) {
        int count = 0;
        final int MAX = 100;

        for (;;) {
            System.out.print("forever");
            count++;
            if (count % 10 == 0) System.out.println();
            if (count == MAX) break;
        }
    }
}
