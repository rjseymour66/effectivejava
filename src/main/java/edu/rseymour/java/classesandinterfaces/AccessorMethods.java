package edu.rseymour.java.classesandinterfaces;

/**
 * Use accessor methods, not public fields. If a class is accessible outside its package,
 * provide accessor fields.
 *
 * If a class is package-private or private nested, you can expose their accessor fields.
 */
public class AccessorMethods {

    private double x;
    private double y;

    public AccessorMethods(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
