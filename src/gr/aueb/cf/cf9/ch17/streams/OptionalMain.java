package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;

public class OptionalMain {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Orange", 8.5, 20),
                new Product("Pineapple", 14.5, 30)
        ));

//        Product product = products.stream()
//                .filter(p -> p.getPrice() >= 20)
//                .findFirst()
//                .orElse(new Product("No product found", 0,0));


        Product product = products.stream()
                .filter(p -> p.getPrice() >= 13)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No product found"));
    }
}
