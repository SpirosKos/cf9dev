package gr.aueb.cf.cf9.solutions.ch16;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        // Declaration & Add
        List<Object> object = new ArrayList<>();
        object.add(new Document());
        object.add(new Photo());

        // Traverse and check instanceof
        Runnable task = () -> {
            for (Object obj : object) {
                if (obj instanceof Printable p) {
                    p.print();
                }
            }
        };

        // Printing
        Thread thread = new Thread(task);
        thread.start();


    }
}
