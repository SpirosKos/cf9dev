package gr.aueb.cf.cf9.solutions.ch16;

public interface Printable {

    default void print(){
        System.out.println("Prints something");
    };
}
