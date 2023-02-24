
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author LabSispc15
 */
public class media {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Escriba el numero 1: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Escriba el numero 2: ");
    double num2 = scanner.nextDouble();
    
    System.out.print("Escriba el numero 3: ");
    double num3 = scanner.nextDouble();
    
    System.out.println("La media es " +(num1+num2+num3)/3);

    }
    
}
