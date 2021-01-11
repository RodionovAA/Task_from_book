package ru.myComoany.part4;

/**
 *
 * @author AleAlRodionov
 */

/*
Define an abstract class Shape with an instance variable of class Point, a
constructor, a concrete method public void moveBy(double dx, double dy) that
moves the point by the given amount, and an abstract method public Point
getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
double height), and public Line(Point from, Point to).
*/
public abstract class Shape {
    
    protected Point point;
    
    public abstract Point getCenter ();
    
    public Shape(double x,double y){
        this.point = new Point(x,y);
    }
 
    public void moveBy(double dx, double dy){
        point.setX(point.getX()+dx);
        point.setX(point.getY()+dy);
    }
    
}
