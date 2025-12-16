package gr.aueb.cf.cf9.ch1;

public class ForEverApp {
    public static void main(String[] args) {
        int count = 0;

        for(;;){
            System.out.print("forever");
            count++;
            if (count % 4 == 0) System.out.println();
            if (count == 100) break;
        }
    }
}
