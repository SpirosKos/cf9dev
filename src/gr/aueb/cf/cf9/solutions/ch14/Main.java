package gr.aueb.cf.cf9.solutions.ch14;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.speak();
        cat.speak();
        doSpeak(cat);
        doSpeak(dog);

    }

    public static void doSpeak(Animal animal){
        animal.speak();
    }
}
