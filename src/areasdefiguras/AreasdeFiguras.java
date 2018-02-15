/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasdefiguras;
import java.util.Scanner;
import Figura.*;
import Figura.Cuadrado;
/**
 *
 * @author david
 */
public class AreasdeFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es la figura?");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        int opcion = sc.nextInt();
        System.out.print("ingrese el primer punto (x,y) con un espacio: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("ingrese el Segunto punto (x,y) con un espacio: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        Figura f;
        switch(opcion){
            case 1:
                f = new Cuadrado();
                break;
            case 2:
                f = new Rectangulo();
                break;
            default:
                f = new Triangulo();
                break;
        }
        f.getPuntos(x1,y1,x2,y2);
        f.calcular();
        
    }
    
}
