package gr.aueb.cf.cf9.ch17.lifo_parking;

public class Main {

    static void main() {
        LifoParking parking = new LifoParking();
        parking.addCar("ASD 123");
        parking.addCar("ASD 235");
        parking.addCar("ASD 567");

        System.out.println();
        String car = parking.removeCar();
//        System.out.println(car);


    }
}
