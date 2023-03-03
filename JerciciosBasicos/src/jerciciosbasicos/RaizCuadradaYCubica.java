
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author luisv
 */
public class RaizCuadradaYCubica {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero");
        int num = scanner.nextInt();
        
        double cuad = Math.pow(num, 2);
        double cub = Math.pow(num, 3);
        
        System.out.println("La cuadrada es: "+cuad+" y la cubica es: "+cub);
        
    }
    
}
