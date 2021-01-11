/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.myComoany.part4;

/**
 *
 * @author AleAlRodionov
 */
public class Line extends Point {
   private Point to;

    public Line(Point from,Point to) {
        super(from.getX(),from.getY());
        this.to = new Point(to.getX(),to.getY());
    }
    
}
