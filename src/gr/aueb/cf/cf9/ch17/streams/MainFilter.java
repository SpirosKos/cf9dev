package gr.aueb.cf.cf9.ch17.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        // filter even numbers

        numbers.stream()
                .filter(num -> num % 2 == 0)     // Intermediate op
                .forEach(System.out::println);          // terminal

        Iterable<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 ==0)      // Intermediate op
                .toList();                              // unmodifiable list

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(num -> num % 2 == 0)     // Intermediate op
                .collect(Collectors.toList());          // unmodifiable list

        var evenNumbers3 = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toArray();

        List<String> cities = List.of("Athens", "Berlin", "Rome", "Japan");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("J"))
                .collect(Collectors.toCollection(ArrayList::new));

        filteredCities.forEach(System.out::println);

        int[] arr = {1, 2, 3, 4, 5};

        var filteredArr = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .toArray();
    }
}
