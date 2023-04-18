/*
Crear un programa que dado un número determine si es par o impar.
 */
package guia_3_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_1_parOimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero para determinar si es par o impar");
        num = Leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar17");
        }
    }
}
