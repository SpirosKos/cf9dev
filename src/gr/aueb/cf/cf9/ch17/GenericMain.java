package gr.aueb.cf.cf9.ch17;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>(); // In generics, no primitives as parameter types

        //Can use this after Java 10+ instead of ^^^
        var intNode = new GenericNode<Integer>();

        doubleNode.setValue(10.5);
        strNode.setValue("Hi");
    }
}
