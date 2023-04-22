package guia_2_ejercicio_1_suma;

import java.util.Scanner;

/*
Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma.

@author Mariano Benegas
 */
public class Guia_2_ejercicio_1_suma {

    public static void main(String[] args) {
        //DEFINO VARIABLES E INICIO SUMA
        int num1, num2, suma;
        //SOLICITO NUMEROS A INGRESAR Y LOS LEO
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros a sumar");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();
        //SUMO VARIABLES
        suma = num1 + num2;
        //MUESTRO RESULTADO SUMA
        System.out.println("La suma de los numeros es: " + suma);
       

    }

}
