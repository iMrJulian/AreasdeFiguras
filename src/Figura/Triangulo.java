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
public class Triangulo extends Figura{
    @Override
     public void calcularA() {
        double h = this.p1.y-this.p2.y;
        double b = this.p2.x-this.p1.x;
        a = (h * b)/2;
        
    }
   
    @Override
    public void calcularP() {
        double d = this.p1.calcularDistancia(this.p2);
        double h = this.p1.y-this.p2.y;
        double b = this.p2.x-this.p1.x;
        this.p = d+h+b;
    }
    
}