/*
 * circulo.java
 * copyright © 2018 LeonardoWiesner JulianRincon DavidBlanco
 */
package Figura;

/**
*La clase circulo permite 
 *@version 3.0
 * @author LeonardoWiesner JulianRincon DavidBlanco
 */
public class Circulo extends figura{
     @Override
     public void calcularA() {
        double r = this.p1.calcularDistancia(this.p2);
        this.a = Math.PI * r*r;
    }
     
    @Override
    public void calcularP() {
        double r = this.p1.calcularDistancia(this.p2);
        this.p = 2*Math.PI*r;
    }
    
}
