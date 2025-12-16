package gr.aueb.cf.cf9.solutions.ch12;

public class PointXYZ {
    private final double x;
    private final double y;
    private final double z;

    public PointXYZ(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }


    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getXYDistance() {
        double distanceSquare = Math.pow(x, 2) + Math.pow(y, 2);
        return Math.sqrt(distanceSquare);
    }
    public double getYZDistance() {
        double distanceSquare = Math.pow(y, 2) + Math.pow(z, 2);
        return Math.sqrt(distanceSquare);
    }
    public double getXZDistance() {
        double distanceSquare = Math.pow(x, 2) + Math.pow(z, 2);
        return Math.sqrt(distanceSquare);
    }

    public double getXYZDistance() {
        double distanceSquare = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        return Math.sqrt(distanceSquare);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
