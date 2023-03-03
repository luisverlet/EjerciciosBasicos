
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author luisv
 */
public class Centimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("ingrese monedas de 20 centimos:");
        int monedas20 = scanner.nextInt();
        System.out.println("ingrese monedas de 10 centimos:");
        int monedas10 = scanner.nextInt();
        System.out.println("ingrese monedas de 2 euros:");
        int monedas2 = scanner.nextInt();
        System.out.println("ingrese monedas de 1 euro:");
        int monedas1 = scanner.nextInt();
        System.out.println("ingrese monedas de 50 centimos:");
        int monedas50 = scanner.nextInt();

        
        double totalEuros = 2 * monedas2 + 1 * monedas1 + 0.5 * monedas50 + 0.2 * monedas20 + 0.1 * monedas10;
        int euros = (int) totalEuros; 
        int centimos = (int) Math.round((totalEuros - euros) * 100);
        
        System.out.println(+ euros + " Euros y " + centimos + " centimos.");
        
       
    }
    
}
