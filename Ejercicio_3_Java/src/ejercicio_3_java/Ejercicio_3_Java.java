/*
 Escribir un programa que pida una frase y la muestre
toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package ejercicio_3_java;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Ejercicio_3_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);     
        //pedir frase
        System.out.println("Ingrese una frase a convertir en mayusculas y minusculas");
        //variable cadena
        String frase; //= new String();      
        String mayus;
        String minus;
        //guardar variable
        frase = leer.next();
        //convertir mayusculas y minusculas
        minus = frase.toLowerCase();
        mayus = frase.toUpperCase();
        //escribir variable
       System.out.println("Su frase en minusculas: " + minus);    
       System.out.println("Su frase en mayusculas: " + mayus);
       System.out.println(frase.toLowerCase());    
    
    }
    
}
