package gr.aueb.cf.cf9.solutions.ch15;

public class Rectangle extends AbstractShape implements ITwoDimensional{
    private double width;
    private double height;


    @Override
    public double getArea() {
        return width * height;
    }
}
