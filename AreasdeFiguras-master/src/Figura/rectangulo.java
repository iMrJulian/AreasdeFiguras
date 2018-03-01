/*
* rectangulo.java
 * copyright © 2018 LeonardoWiesner JulianRincon DavidBlanco
 */
package Figura;

/**
 *La clase rectangulo permite 
 *@version 3.0
 * @author LeonardoWiesner JulianRincon DavidBlanco
 */
public class rectangulo extends figura{
    @Override
     public void calcularA() {
        double h,b;
        if (this.p1.y>this.p2.y)
            h = this.p1.y-this.p2.y;
        
        else
            h = this.p2.y-this.p1.y;
        
        if (this.p1.x>this.p2.x)
            b = this.p1.x-this.p2.x;
        
        else
            b = this.p2.x-this.p1.x;
        
        a = h * b;
        
    }
   
    @Override
    public void calcularP() {
        double h,b;
        if (this.p1.y>this.p2.y)
            h = this.p1.y-this.p2.y;
        
        else
            h = this.p2.y-this.p1.y;
        
        if (this.p1.x>this.p2.x)
            b = this.p1.x-this.p2.x;
        
        else
            b = this.p2.x-this.p1.x;
        
        this.p = 2*h+2*b;
    }
    
    
}
