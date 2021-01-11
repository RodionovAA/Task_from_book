package ru.myComoany.part4;

/**
 *
 * @author AleAlRodionov
 */
public class Circle extends Point {
    
    private double radius;
    
    public Circle(Point center,double radius) {
        super(center.getX(), center.getY());
        this.radius = radius;
    }
    
}
