package gr.aueb.cf.cf9.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Orange", 8.5, 20),
                new Product("Pineapple", 14.5, 30)
        ));

        products.sort(Comparator.naturalOrder());   // Ascending order
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());   // Descending order

        products.sort(Comparator.comparing(Product::getPrice));
//        products.sort((a,b) -> a.getQuantity() - b.getQuantity());    // Ascending order
        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())    // price descending
                .thenComparing(Product::getDescription).reversed());            // the final-total result descend
    }
}
