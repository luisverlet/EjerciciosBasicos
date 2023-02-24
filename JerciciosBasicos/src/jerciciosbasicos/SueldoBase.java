
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class SueldoBase {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite su sueldo: ");
    double sueldo = scanner.nextDouble();
    
    System.out.println("Digite sus ventas: ");
    double ventas = scanner.nextDouble();
    
    double comision;
    comision = sueldo*0.10;
    
    double totcom;
    totcom = comision*ventas;
    
    double total;
    total = totcom+sueldo;
    
    System.out.print("Su total por comisiones es: "+totcom+" su total general es: "+total);
    
    
    
    
    }   
}
