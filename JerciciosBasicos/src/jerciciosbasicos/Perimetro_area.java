
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author LabSispc15
 */
public class Perimetro_area {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite la base del rectangulo en metros: ");
    double base = scanner.nextDouble();
    System.out.println("Digite la base del rectangulo en metros: ");
    double altura = scanner.nextDouble();
       
    double area_rectangulo = 2*base+altura;
    System.out.print("El perimetro de un rectangulo de base "+base+" y altura "+altura+" es igual a "+area_rectangulo+ " y su area es "+ (base*altura));
    
    }
}
