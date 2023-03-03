
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author luisv
 */
public class Ciclista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Ingrese la hora de partida (formato 24 horas):");
        int h = scanner.nextInt();
        System.out.println("Ingrese los minutos de partida:");
        int m = scanner.nextInt();
        System.out.println("Ingrese los segundos de partida:");
        int s = scanner.nextInt();
        System.out.println("Ingrese el tiempo de viaje en segundos:");
        int T = scanner.nextInt();
        

        int segundos = h * 3600 + m * 60 + s + T;
        int hLlegada = segundos / 3600 % 24;
        int mLlegada = segundos % 3600 / 60;
        int sLlegada = segundos % 60;
        
        System.out.printf("La hora de llegada a la ciudad B es "+hLlegada+ ":"+mLlegada+ ":"+ sLlegada);
        
    }
    
}
