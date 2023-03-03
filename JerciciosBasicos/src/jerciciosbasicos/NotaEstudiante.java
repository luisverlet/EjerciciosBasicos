
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author luisv
 */
public class NotaEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese el numero de respuestas correctas:");
        int correctas = scanner.nextInt();
        System.out.println("Ingrese el numero de respuestas incorrectas:");
        int incorrectas = scanner.nextInt();
        System.out.println("Las no constestadas no son necesarias puesto que no suman ni restan");
        
        int notaFinal = 5 * correctas - incorrectas;
        
        System.out.println("La nota final es: " + notaFinal);
    }
}
