package ru.myComoany.part2;

/**
 *
 * @author AleAlRodionov
 */

/*
Implement an immutable class Point that describes a point in the plane.
Provide a constructor to set it to a specific point, a no-arg constructor to
set it to the origin, and methods getX, getY, translate, and scale. The translate
method moves the point by a given amount in x- and y-direction. The
scale method scales both coordinates by a given factor. Implement these
methods so that they return new points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
*/
public final class Point {
    private double X = 0.0;
    private double Y = 0.0;

    public Point(){}
    
    public Point(double x,double y){
        this.X = x;
        this.Y = y;
    }
    
    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }
    public Point translate(double addX, double addY){
        return new Point(this.X + addX,this.Y + addY);
        
    }
    
    public Point scale(double coefficient){
        return new Point(this.X * coefficient,this.Y * coefficient);
        
    }

}
