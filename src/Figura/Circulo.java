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
    public void calcular(){
        double r,a;
        int b,h;
        if (x1==x2)
            r=y2-y1;
        else
            if (y1==y2)
               r=x2-x1;
            else{
                if (y1>y2){
                    h=y1-y2;
                    b=x2-x1;
                }else{
                    h=y2-y1;
                    b=x2-x1;
                }
                r=Math.sqrt((h*h)+(b*b));
            }
    a=3.1416*r*r;   
    System.out.println("El area es "+a);
    }
    
}
