/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author david
 */
public abstract class Figura {
    double a,p;
  
    public Punto p1;
    public Punto p2;
    
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public double getA() {
        return a;
    }

    public double getP() {
        return p;
    }
    
    public abstract void calcularA();
    
    public abstract void calcularP();
}
