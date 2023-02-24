
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class calculosimple {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Dame el valor del primer número: ");
    double numero1 = scanner.nextDouble();
    
    System.out.print("Dame el valor del segundo número: ");
    double numero2 = scanner.nextDouble();

    System.out.println("La suma de estos numeros es " + (numero1 + numero2));
    System.out.println("La resta de estos numeros es " + (numero1 - numero2));
    System.out.println("La multiplicacion de estos numeros es " + (numero1 * numero2));
    System.out.println("La division de estos numeros es " + (numero1 / numero2));
  }
}