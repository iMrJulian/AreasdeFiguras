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
public class Rectangulo extends Figura{
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
