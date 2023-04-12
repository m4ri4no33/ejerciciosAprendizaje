/*
 Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.
 */
package manosalaobra_ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ManosALaObra_ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       int num1;
       int num2;
       System.out.println("ingrese dos numeros enteros");
       num1 = Leer.nextInt();
       num2 = Leer.nextInt();
       if (num1 > 25 || num2 > 25)  {
           System.out.println("uno o los dos son mayores a 25");            
       } else {
           System.out.println("ningun numero es mayor a 25"); 
       } 
    }
    
}
