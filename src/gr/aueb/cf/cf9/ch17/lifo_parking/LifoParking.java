package gr.aueb.cf.cf9.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LifoParking {

    private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {

    }

    public List<String> getParking() {
        return List.copyOf(parking);
    }

    public void addCar(String car) {
        parking.push(car);
        System.out.println(LocalDateTime.now() + ": Enter, Plate Number= " + car);
    }

    public String removeCar() {
        String car = parking.pop();
        System.out.println(LocalDateTime.now() + ": Exit, Plate number= " + car);
        return car;
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}
