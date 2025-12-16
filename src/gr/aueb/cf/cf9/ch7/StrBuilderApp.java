package gr.aueb.cf.cf9.ch7;

/**
 * Concat becomes efficient with StringBuilder.
 */
public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";      // immutable
        long timeStart = 0L;
        long timeEnd = 0L;
        double elapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            concatStr = concatStr + i;
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println( "Elapsed time: " + elapsedTime + " seconds");

        // String Builder
        StringBuilder sb = new StringBuilder();     // Mutable
        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        elapsedTime = (timeEnd - timeStart) / 1000.0;
        System.out.println( "Elapsed time: " + elapsedTime + " seconds");
    }
}
