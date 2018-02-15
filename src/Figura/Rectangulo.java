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
    public void calcular(){
    int l;
        if (y1>y2)
            l=y2-y1;
        else
            l=x2-x1;
    System.out.println("El area es "+l*l);
    }
   
    
}
