/*
Realizar un programa que solo permita introducir solo frases o
palabras de 8 de largo. Si el usuario ingresa una frase o 
palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

 */
package guia_3_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_3_largoFrase {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String frase;
        int longitud;
        System.out.println("Ingrese una frase de 8 caracteres");
        frase = Leer.next();
        longitud = frase.length();
        //System.out.println(longitud);
        if (longitud == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTOM");
        }
    }
}

