package gr.aueb.cf.cf9.solutions.ch12;

import gr.aueb.cf.cf9.ch11.Point;

public class Main {
    public static void main(String[] args) {

        PointXYZ point = new PointXYZ(3.0, 4.0, 0.0);
        PointXYZ point3D = new PointXYZ(3.0, 4.0, 12.0);

        System.out.println("Distance for (3,4,0) is = " + point.getXYDistance());
        System.out.println("Distance for (3,4,12 is = " + point3D.getXYZDistance());
    }
}
