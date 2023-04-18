/*
 Crear un programa que pida una frase y si esa frase es igual 
a “eureka” el programa pondrá un mensaje de Correcto, sino
mostrará un mensaje de Incorrecto. Nota: investigar la 
función equals() en Java.
 */
package guia_3_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_2_fraseEureka {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String eureka;
        System.out.println("Ingrese la frase: eureka");
        eureka = Leer.next();

        if ("eureka".equals(eureka)) {
            System.out.println("La frase es correcta");
        } else {
            System.out.println("La frase es incorrecta");
        }

    }
}
