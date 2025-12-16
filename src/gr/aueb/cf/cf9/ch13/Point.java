package gr.aueb.cf.cf9.ch13;

import java.util.Random;

public class Point {
    private int x;
    private int y;

    private Point(){

    }

    private Point(int x, int  y){
        this.x = x;
        this.y =y;
    }

    /**
     * Static factory method.
     * @return  return a new instance;
     */
    public static Point getInstance(){
        return new Point();
    }
    public static Point getRandomPoint(){
        final int BOUND = 101;
        Random random = new Random(System.nanoTime());
        // (max - min +1) + 1
        return new Point(random.nextInt(BOUND - 1 + 1) + 1, random.nextInt(BOUND - 1 + 1) + 1);
    }

}
