package gr.aueb.cf.cf9.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {

            }
        };

        // Lambda expression
        Printable printable1 = () -> System.out.println("Hello World!");
        Printable printable2 = () -> doPrint();

        //Method reference
        Printable printable3 = Main::doPrint;

        doWithPrintable(printable);
        doWithPrintable(printable2);
        doWithPrintable(printable3);

        System.out.println("----------ANONYMOUS CLASSES");

        // Old Method
        doWithPrintable(new Printable() {
            @Override
            public void print() {

            }
        });

        System.out.println("---------LAMBDA EXPRESSIONS");

        doWithPrintable(() -> System.out.println("Hello World!"));

        System.out.println("----------METHOD REFERENCES");

        doWithPrintable(Main::doPrint);
        doWithPrintable(System.out::println);
    }

    public static void doPrint() {
        System.out.println("Hello World!");
    }

    public static void doWithPrintable(Printable printable){
        printable.print();
    }
}
