package ru.myComoany.part2;

import java.io.IOException;


/**
 *
 * @author AleAlRodionov
 */

/*
Implement a class Car that models a car traveling along the x-axis, consuming
gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?
*/
public class Car {
    
    private int gasolineInBak = 0;
    private double rate;

    public Car(double rate) {
        System.out.println(rate);
        try{
            if (rate <= 0){
                throw new IOException("Rate is incorrect");
            }else {
                this.rate = rate;
            }
        } catch (IOException ex) {
                 ex.printStackTrace();
        }
    }

    public int getGasolineInBak() {
        return gasolineInBak;
    }
    
    public void addGasoline(int addGas){
        this.gasolineInBak+=addGas;
    }
    
     public double getDistance(){
         if (this.rate <= 0){
             try {
                 throw new IOException("Rate is incorrect");
             } catch (IOException ex) {
                 ex.printStackTrace();
             }
         }
       return (gasolineInBak/rate)*100;
       
    }
 /* 
    This class can be immutable, becouse the Car class 
    can be extended with other characteristics and methods
     */
}
