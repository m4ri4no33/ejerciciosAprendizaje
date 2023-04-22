package guia_3_ejercicio_4_validarprimerletra;

import java.util.Scanner;

/*
Escriba un programa que pida una frase o palabra y valide si la 
primera letra de esa frase es una ‘A’. Si la primera letra es una
‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.
  @author Mariano Benegas
 */
public class Guia_3_ejercicio_4_validarPrimerLetra {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String frase;

        System.out.print("Ingrese una frase que comience con A");
        frase = Leer.next();
        //SUBSTRING ACCEDE A LA POSICION DE LA CADENA
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
