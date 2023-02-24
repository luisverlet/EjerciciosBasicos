
package jerciciosbasicos;
import java.util.*;

/**
 *
 * @author LabSispc15
 */
public class AlumNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      

            System.out.println("Introduzca su primera calificacion parcial(usando , para decimales): ");
            float prim = scanner.nextFloat();
            System.out.println("Introduzca su segunda calificacion parcial(usando , para decimales): ");
            float seg = scanner.nextFloat();
            System.out.println("Introduzca su tercera calificacion parcial(usando , para decimales): ");
            float ter = scanner.nextFloat();
            
            float nota1=0;
            nota1= nota1+prim+seg+ter;
          
            double prom;
            prom = nota1/3;
            double nota4 = prom*0.55;
            
            System.out.println("Introduzca la calificacion de su examen final(usando , para decimales)");
            double nota2 = scanner.nextDouble();
            nota2 = nota2*0.30;
            
            System.out.println("Introduzca la calificacion de su trabajo final(usando , para decimales)");
            double nota3 = scanner.nextDouble();
            nota3 = nota3*0.15;
            
            double finalnot;
            finalnot=nota4+nota2+nota3;
                   
            
            System.out.print("Su nota final es:  "+finalnot);
    }
    
}
