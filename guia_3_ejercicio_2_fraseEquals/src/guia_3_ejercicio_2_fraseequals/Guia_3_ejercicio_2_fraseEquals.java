package guia_3_ejercicio_2_fraseequals;

import java.util.Scanner;

/* 
  Crear un programa que pida una frase y si esa frase es 
igual a “eureka” el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. Nota: investigar la función 
equals() en Java. 
  @author Mariano Benegas
 */
public class Guia_3_ejercicio_2_fraseEquals {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String Palabra;
        System.out.println("Ingrese una palabra");
        Palabra = Leer.nextLine();
        // funcion equals compara tipo y datos dentro de una cadena
        if (Palabra.equals("eureka")) {
            System.out.println("La palabra es correcta");
        } else {
            System.out.println("La palabra es incorrecta");
        }

    }

}
