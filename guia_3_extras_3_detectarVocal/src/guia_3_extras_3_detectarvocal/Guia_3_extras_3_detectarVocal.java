package guia_3_extras_3_detectarvocal;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función 
equals() de la clase String.
 * @author Mariano Benegas
 */
public class Guia_3_extras_3_detectarVocal {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese una letra a comparar");
        String letra = Leer.next();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es vocal");
        } else {
            System.out.println("La letra ingresada no es vocal");
        }

    }

}
