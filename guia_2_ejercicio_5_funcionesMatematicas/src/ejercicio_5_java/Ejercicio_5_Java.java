/*
 Escribir un programa que lea un número entero por teclado
y muestre por pantalla el doble, el triple y la raíz cuadrada 
de ese número. 
Nota: investigar la función Math.sqrt().

 */
package ejercicio_5_java;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Ejercicio_5_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       Scanner Leer = new Scanner(System.in);          
       int numero;
       int doble;
       int triple;
       double raiz;
       System.out.println("Ingrese un numero entero");
       numero = Leer.nextInt();
       doble = numero * 2;
       triple = numero * 3;
       raiz = Math.sqrt(numero);
       System.out.println("El doble de su numero es: " + doble);
       System.out.println("El triple de su numero es: " + triple);
       System.out.println("La raiz cuadrada de su numero es: " + raiz);
    }
    
}
