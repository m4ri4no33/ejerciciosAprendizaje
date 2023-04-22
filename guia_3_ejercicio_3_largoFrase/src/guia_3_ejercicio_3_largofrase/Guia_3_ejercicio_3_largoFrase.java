package guia_3_ejercicio_3_largofrase;

import java.util.Scanner;

/*Realizar un programa que solo permita introducir solo frases o
palabras de 8 de largo. Si el usuario ingresa una frase o 
palabra de 8 de largo se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
@author Mariano Benegas
 */
public class Guia_3_ejercicio_3_largoFrase {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String frase;
        int longitud;
        System.out.println("Ingrese una frase de 8 caracteres");
        frase = Leer.next();
        // LENGTH ARROJA UN ENTERO EQUIVALENTE AL LARGO DE LA CADENA
        longitud = frase.length();
        //System.out.println(longitud);
        if (longitud == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");

        }

    }
}
