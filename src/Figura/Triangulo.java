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
    public void calcular(){
    int h,b,a;
        if (y1>y2){
            h=y1-y2;
            b=x2-x1;
        }else{
            h=y2-y1;
            b=x2-x1;
        }
    a=(b*h)/2; 
    System.out.println("El area es "+a);
    }
}
