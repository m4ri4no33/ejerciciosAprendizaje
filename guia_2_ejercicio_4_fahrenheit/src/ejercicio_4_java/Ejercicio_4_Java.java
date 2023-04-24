package ejercicio_4_java;

import java.util.Scanner;

/*
Dada una cantidad de grados centígrados se debe mostrar 
su equivalente en grados Fahrenheit. La fórmula correspondiente
es: F = 32 + (9 * C / 5).
@author Mariano Benegas
 */
public class Ejercicio_4_Java {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        double fahrenheit;
        int centigrados;
        System.out.println("Ingrese grados centigrados");
        centigrados = Leer.nextInt();
        fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("Los grados fahrenheit son: " + fahrenheit);
    }
}
