/*
 * cuadrado.java
 * copyright © 2018 LeonardoWiesner JulianRincon DavidBlanco
 */
package Figura;

/**
*La clase cuadrado permite 
 *@version 3.0
 * @author LeonardoWiesner JulianRincon DavidBlanco
 */
public class Cuadrado extends figura{
    @Override
     public void calcularA() {
        double l = this.p1.calcularDistancia(this.p2);
        this.a = l * l;
    }
     
    @Override
    public void calcularP() {
        double l = this.p1.calcularDistancia(this.p2);
        this.p = l * 4;
    }
    
}
