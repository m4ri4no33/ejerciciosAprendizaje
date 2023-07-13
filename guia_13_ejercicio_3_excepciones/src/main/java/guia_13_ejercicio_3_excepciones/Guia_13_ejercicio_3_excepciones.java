/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia_13_ejercicio_3_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_13_ejercicio_3_excepciones {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        try {
            System.out.println("Ingrese un numero");
            int num1 = leer.nextInt();
            System.out.println("Ingrese un numero ");
            String num2 = leer.next();
            
            int numero2 = Integer.parseInt(num2);
                    
        } catch (InputMismatchException e) {
        }
       
    }
}
