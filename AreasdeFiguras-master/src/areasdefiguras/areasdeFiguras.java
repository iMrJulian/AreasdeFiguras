/*
 * areasdeFiguras.java
 * copyright © 2018 LeonardoWiesner JulianRincon DavidBlanco
 */
package areasdefiguras;
import java.util.Scanner;
import Figura.*;

/**
 *La clase areasdefiguras permite desplegar un menu para la seleccion del usuario
 y escanea su seleccion redirigiendo el proceso a la clase donde se le solicita calcular.
 *@version 3.0
 * @author LeonardoWiesner JulianRincon DavidBlanco
 */
public class areasdeFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int finalizar=0;
        do{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es la figura?");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Circulo");
        
        punto p1 = new punto();
        punto p2 = new punto();
        
        int opcion= sc.nextInt();
        
        if (opcion<5 && opcion>0){
            System.out.print("Ingrese las cordenadas (x,y) del primer punto con espacio: ");
            p1.setX(sc.nextDouble());
            p1.setY(sc.nextDouble());
            System.out.print("Ingrese las cordenadas (x,y) del segundo punto con espacio: ");
            p2.setX(sc.nextDouble());
            p2.setY(sc.nextDouble());
        
            figura f;
            switch(opcion){
                case 1:
                    f = new Cuadrado();
                    break;
                case 2:
                    f = new rectangulo();
                    break;
                case 3:
                    f = new triangulo();
                    break;
                default:
                    f = new Circulo();
                    break;
            
            }
        
            f.setP1(p1);
            f.setP2(p2);
        
            f.calcularA();
            f.calcularP();
        
            System.out.println("el area es: " + f.getA());
            System.out.println("el perimetro es " + f.getP());
       
            System.out.println("Desea continuar?\n0. Si \n1. No");
            finalizar=sc.nextInt();
            System.out.println(" ");
        }
        else
            System.out.println("Su opcion no es valida por favor intentelo nuevamente");
       }while(finalizar!=1);
    }
    
}
