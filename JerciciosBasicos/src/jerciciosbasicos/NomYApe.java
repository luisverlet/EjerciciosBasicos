
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author luisv
 */
public class NomYApe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el primer apellido:");
        String ape1 = scanner.nextLine();
        System.out.println("Ingrese el segundo apellido:");
        String ape2 = scanner.nextLine();
        
        char inicialApe1 = ape1.charAt(0);
        char inicialApe2 = ape2.charAt(0);
        char inicialNombre = nombre.charAt(0);
 
        System.out.println("Las iniciales son: " + inicialNombre + "." + inicialApe1 + "." + inicialApe2 + ".");
        

            
        
    }
}
