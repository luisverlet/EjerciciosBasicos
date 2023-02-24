
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class TiendaDescuento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese total de su compra: ");
        double compra = scanner.nextDouble();
        System.out.println("Su total de compra es: "+(compra-compra*0.15));
    }
    
}
