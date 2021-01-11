package ru.myComoany.part4;

/**
 *
 * @author AleAlRodionov
 */

/*
Define a class Point with a constructor public Point(double x, double y) and
accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
public LabeledPoint(String label, double x, double y) and an accessor method
getLabel.
*/

/*
Make the instance variables x and y of the Point class in Exercise 1 protected.
Show that the LabeledPoint class can access these variables only in LabeledPoint
instances.
*/

public class Point {
    
    protected double X = 0.0;
    protected double Y = 0.0;

    public Point(double x,double y){
        this.X = x;
        this.Y = y;
    }

    public void setX(double X) {
        this.X = X;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.X) ^ (Double.doubleToLongBits(this.X) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.Y) ^ (Double.doubleToLongBits(this.Y) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.X) != Double.doubleToLongBits(other.X)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Y) != Double.doubleToLongBits(other.Y)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Point{" + "X=" + X + ", Y=" + Y + '}';
    }

}
