package ru.myComoany.part4;

import java.util.Objects;

/**
 *
 * @author AleAlRodionov
 */
/*
/*
Define toString, equals, and hashCode methods for the classes of the preceding
exercise.
*/
class LabeledPoint extends Point {
    private String label;
    
    public LabeledPoint(String label,double x,double y){
       
        super(x,y);
        this.label = label;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.label);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.X) ^ (Double.doubleToLongBits(this.X) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.Y) ^ (Double.doubleToLongBits(this.Y) >>> 32));
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
        final LabeledPoint other = (LabeledPoint) obj;
        if (!Objects.equals(this.label, other.label) || !Objects.equals(this.X, other.X) || !Objects.equals(this.Y, other.Y)  ) {
            return false;
        }
        return true;
    }
    
    public String getLabel() {
        return label;
    }
   
}
