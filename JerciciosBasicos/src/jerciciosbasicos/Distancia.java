
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Distancia {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Escriba el numero 1 ");
        int uno = scanner.nextInt();
       
        System.out.println("Escriba el numero 2 ");
        int dos = scanner.nextInt();
        int tres = uno-dos;
        if (tres<0) {
            tres = tres*-1;
        }
        
        System.out.println("La distancia es: "+tres);
        
    }
        
}
