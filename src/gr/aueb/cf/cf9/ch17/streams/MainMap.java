package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMap {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4,5);
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.5, 10),
                new Product("Orange", 8.5, 20),
                new Product("Pineapple", 14.5, 30)
        ));

        var squares = numbers.stream()
                .map(num -> num * num)      //Intermediate op
                .toList();                        // Terminal op
        squares.forEach(System.out::println);

        var listOfDescriptions = products.stream()
                .map(Product::getDescription)
                .toList();

        listOfDescriptions.forEach(System.out::println);

        String listOfDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listOfDescriptions2);
    }
}
