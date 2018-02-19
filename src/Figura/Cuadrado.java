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
public class Cuadrado extends Figura{
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
