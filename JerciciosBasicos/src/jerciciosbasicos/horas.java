
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class horas {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    
    System.out.print("Escriba los minutos: ");
    int min = scanner.nextInt(); 
    int horas = min /60;
    int min2 = min % 60;
    
    System.out.println(horas+":"+min2);
    }
    
}
