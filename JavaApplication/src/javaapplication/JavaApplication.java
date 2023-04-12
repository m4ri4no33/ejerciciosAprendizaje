/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //leer tipeo de teclado
        Scanner leer = new Scanner(System.in);
        //declarar variables
        int num1;
        int num2;
        int suma;
        //pedir numeros al usuario 
        System.out.println("ingrese dos numeros a sumar");
        //lee y suma
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        //entregas el resultado
        System.out.println("la suma es " +suma);
               
    }
    
}
