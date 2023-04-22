package guia_3_ejercicio_1_paroimpar;

import java.util.Scanner;

/*
 Crear un programa que dado un número determine si es par o impar.
 @author Mariano Benegas
 */
public class Guia_3_ejercicio_1_parOimpar {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num1;

        System.out.println("Ingrese un numero para determinar si es par o impar");
        num1 = Leer.nextInt();
        // SI NUMERO ES DIVISIBLE EN 2 Y EL RESTO ES 0 = VERDADERO
        if (num1 % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else { // SI NO ES DIVISIBLE 
            System.out.println("El numero ingresado es impar");
        }
    }

}
