
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Intercambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la variable A:");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor de la variable B:");
        int B = scanner.nextInt();
        
        int C=A;
        A=B;
        B=C;
      
        System.out.println("Después del intercambio, el valor de A es: " + A);
        System.out.println("Después del intercambio, el valor de B es: " + B);
    }
    
}
