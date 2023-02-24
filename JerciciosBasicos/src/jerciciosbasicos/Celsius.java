
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class Celsius {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Introduzca la temperatura en Fahrenheit: ");
    double temp1 = scanner.nextDouble();
    double temp2 = (temp1-32)*5/9;
    System.out.println("El resultado es " +temp2);
    }
    
}
