package guia_2_ejercicio_2_nombrevariable;

import java.util.Scanner;

/*
Escribir un programa que pida tu nombre, lo guarde en una variable 
y lo muestre por pantalla.

@author Mariano Benegas
 */
public class Guia_2_ejercicio_2_nombreVariable {

    public static void main(String[] args) {

        // DEFINIR VARIABLE CADENA
        String nombre;
        // PEDIR INGRESO POR TECLADO Y LEERRLO
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = Leer.nextLine();
        // GUARDADO EN LA VARIABLE, AHORA LO MUESTRO
        System.out.println("Su nombre es: " + nombre);

    }

}
