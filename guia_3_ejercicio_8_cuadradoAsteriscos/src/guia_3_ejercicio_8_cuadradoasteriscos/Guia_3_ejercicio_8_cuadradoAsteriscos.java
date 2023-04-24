package guia_3_ejercicio_8_cuadradoasteriscos;

import java.util.Scanner;

/* @author Mariano Benegas
 */
public class Guia_3_ejercicio_8_cuadradoAsteriscos {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño cuadrado");
        int tamaño = Leer.nextInt();

        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        }
        System.out.println();// SALTO DE LINEA
        
        for (int i = 0; i < tamaño - 2; i ++) {
            System.out.print("*");
            for (int j = 0; j < tamaño - 2; j ++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < tamaño; i++) {
            System.out.print("*");
        }

    }
}
