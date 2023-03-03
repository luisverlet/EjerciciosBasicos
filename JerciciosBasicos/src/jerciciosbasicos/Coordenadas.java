
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author luisv
 */
public class Coordenadas {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba las cordenadas x del primer punto: ");
        double y1 = scanner.nextDouble();
        System.out.println("Escriba las coordenadas y del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.println("Escriba las coordenadas x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.println("Escriba las coordenadas y del segundo punto: ");
        double y2 = scanner.nextDouble();
        
        double op1,op2;
        op1=x2-x1;
        op2=y2-y1;
        
        double distancia = Math.sqrt(Math.pow(op1,2))+Math.sqrt(Math.pow(op2,2));
        System.out.println("La distancia es: "+distancia);
        
        
        
    }
}
