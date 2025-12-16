package gr.aueb.cf.cf9.ch14;

public class Point2D extends Point{
    private double y;

    public Point2D(){
        super(); //points to superclass e.g Point , even if i forget it declares super()
        y = 0.0;   // even if i dont declare it it does by Java
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePLusOne() {
        super.movePLusOne();
        y += 1;
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String toString() {
        return "( " + getX() + " ," + y + ")" ;
    }
}
