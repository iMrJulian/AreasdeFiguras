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
public class Circulo extends Figura{
     @Override
     public void calcularA() {
        double r = this.p1.calcularDistancia(this.p2);
        this.a = Math.PI * r;
    }
     
    @Override
    public void calcularP() {
        double r = this.p1.calcularDistancia(this.p2);
        this.p = 2*Math.PI*r;
    }
    
}
