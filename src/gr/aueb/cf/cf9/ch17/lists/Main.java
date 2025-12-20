package gr.aueb.cf.cf9.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    static void main() {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");   //index 0
        cities.add("Berlin");   //index 1
        cities.add("Rome");     //index 2

        // Get
        String myCity = cities.get(0);
        System.out.println(myCity);

        // Set - Update
        int position = cities.indexOf("Rome"); //override equals
        if (position == - 1) {
            System.out.println("City not found");
        }else{
            cities.set(position,"Moscow");
        }

        // Remove
        if (cities.contains("Moscow")){
            cities.remove("Moscow");
        }else {
            System.out.println("Not found");
        }

        // Traverse with for
        for (int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        // Traverse with enhanced for
        for (String city : cities){
            System.out.println(city);
        }

        // Iterator
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println(city);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()){
            if (it.next().equals("Moscow")){
                it.remove();        // Never cities.remove("Moscow"); fails fast
            }
        }

        cities.removeIf(c -> c.equals("Moscow"));

        //cities.forEach(c -> System.out.println(c));
        cities.forEach(System.out::println);
    }
}
