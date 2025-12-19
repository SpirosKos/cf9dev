package gr.aueb.cf.cf9.ch16.equals_hashcode;

public class Main {

    static void main() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 5);

        System.out.println(p1.equals(p2));
    }
}
