package ru.myComoany.part4;

/**
 *
 * @author AleAlRodionov
 */
public class Rectangle extends Point {
        
   private double width;
   private double height;
    
    public Rectangle(Point topLeft,double width,double height) {
        super(topLeft.getX(), topLeft.getY());
        this.width = width;
        this.height = height;
    }
    
}
