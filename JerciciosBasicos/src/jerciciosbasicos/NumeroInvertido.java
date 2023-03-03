
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author luisv
 */
public class NumeroInvertido {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero");
        int num = scanner.nextInt();
        if (num<=99) {
        int unidades = num % 10;
        int decenas = num / 10;
        int numeroInvertido = unidades * 10 + decenas;
        System.out.println("El numero invertido es: "+numeroInvertido);
        }else{
            System.out.println("Solo numeros de dos cifras");
        }   
            
    }
    
}
