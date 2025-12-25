package gr.aueb.cf.cf9.solutions.ch16;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {

        // Declaration
        List<Object> object = new ArrayList<>();
        Printable document = new Document();
        Printable photo = new Photo();


        // Add to List
        object.add(document);
        object.add(photo);

        // Traverse and check instanceof Printable
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
