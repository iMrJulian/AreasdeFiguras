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
    public void calcular(){
    int l,r;
        if (x1==x2)
            l=y2-y1;
        else
            l=x2-x1;
    r=l*l;
    System.out.println("El area es "+r);
    }
   
    
}
