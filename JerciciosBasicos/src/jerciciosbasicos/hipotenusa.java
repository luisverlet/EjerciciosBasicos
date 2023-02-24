/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jerciciosbasicos;
import java.util.*;
/**
 *
 * @author LabSispc15
 */
public class hipotenusa {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
      
      System.out.print("Introduce la longitud del primer cateto: ");
      double cateto1 = scanner.nextDouble();
      
      System.out.print("Introduce la longitud del segundo cateto: ");
      double cateto2 = scanner.nextDouble();
      
      double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
      
      System.out.println("La hipotenusa del triangulo es: " + hipotenusa);
   }
}




