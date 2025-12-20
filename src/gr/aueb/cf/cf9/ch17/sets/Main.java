package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void main() {
        Set<String> bag = new HashSet<>();

        // add - No duplicates allowed
        bag.add("apple");
        bag.add("fruit");
        bag.add("fruit2");

        if (bag.contains("apple")) {    //override equals
            bag.remove("apple");
        }else {
            System.out.println("Not found");
        }

        bag.forEach(System.out::println);
    }
}
