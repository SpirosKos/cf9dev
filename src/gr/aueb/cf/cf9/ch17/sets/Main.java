package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void main() {
        Set<String> bag = new HashSet<>();

        // add - No duplicates allowed
        bag.add("apple");
        bag.add("kiwi");
        bag.add("banana");

        // Time-complexity O(1)
        if (bag.contains("apple")) {    //override equals && hashCode
            bag.remove("apple");
        }else {
            System.out.println("Not found");
        }

        bag.removeIf(item -> item.startsWith("b"));
        bag.forEach(System.out::println);
    }
}
