/*
 * punto.java
 * copyright © 2018 LeonardoWiesner JulianRincon DavidBlanco
 */
package Figura;

/**
*La clase punto permite 
 *@version 3.0
 * @author LeonardoWiesner JulianRincon DavidBlanco
 */
public class punto {
    double x,y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double calcularDistancia(punto p){
        double distancia = Math.sqrt(Math.pow((this.x - p.x),2)+Math.pow((this.y - p.y),2));
        return distancia;
    }
    
}
