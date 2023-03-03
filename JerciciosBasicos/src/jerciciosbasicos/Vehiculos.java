
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Vehiculos {
     public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
         
        System.out.println("Ingrese la distancia entre los vehiculos en kilometros:");
        double d = scanner.nextDouble();
        System.out.println("Ingrese la velocidad del primer vehiculo en km/h:");
        double v1 = scanner.nextDouble();
        System.out.println("Ingrese la velocidad del segundo vehiculo en km/h:");
        double v2 = scanner.nextDouble();
        
        double tiempo = (d / (v2 - v1)) * 60;
        
        System.out.println("Se van a encontrar en " + tiempo + " minutos.");
        
         
     }
    
}
