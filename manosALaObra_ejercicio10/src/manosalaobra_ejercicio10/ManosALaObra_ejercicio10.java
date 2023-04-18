/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique 
su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package manosalaobra_ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
/**
 *
 * @author Mariano Benegas
 */
public class ManosALaObra_ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();
        num3 = Leer.nextInt();
        num4 = Leer.nextInt();

        if (num1 >= 1 && num1 <= 20) {
            System.out.print(num1);
            for (int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        if (num2 >= 1 && num2 <= 20) {
            System.out.print(num2);
            for (int i = 0; i < num2; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        if (num3 >= 1 && num3 <= 20) {
            System.out.print(num3);
            for (int i = 0; i < num3; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        if (num4 >= 1 && num4 <= 20) {
            System.out.print(num4);
            for (int i = 0; i < num4; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        } else {
            System.out.println("Numero no valido");
        }
    }

}
