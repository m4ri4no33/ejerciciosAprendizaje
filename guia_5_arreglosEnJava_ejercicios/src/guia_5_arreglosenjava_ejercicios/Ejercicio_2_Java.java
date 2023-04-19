/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_arreglosenjava_ejercicios;

import java.util.Scanner;

/*Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra
repetido.
 * @author Mariano Benegas
 */
public class Ejercicio_2_Java {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar tamaño de vector");
        int dim = leer.nextInt();
        int numb, cont = 0;
        int[] vector = new int[dim]; //DIMENSIONA

        // RELLENO ALEATORIO
        for (int i = 0; i < dim; i++) {
            vector[i] = (int) (Math.random() * 99);
        }
        // MUESTRA VECTOR
        for (int i = 0; i < dim; i++) {
            System.out.println("[" + vector[i] + "]");

        }
        // ingresa numero a buscar
        System.out.println("Ingrese numero a buscar");
        numb = leer.nextInt();
        
        for (int i = 0; i < dim; i++) {
            if (numb == vector[i]) {//compara numero en posicion de vector
                System.out.println("El numero se uncuentra en " + i);
                cont++;// aux contador si esta repetido
            }
        }
        if (cont == 0) {//no esta el numero a buscar
            System.out.println("El numero no se uncuentra en vector");
        } else if ( cont > 1 )  {//cantador +1 valida repeticion
            System.out.println("El numero se encuentra repetido"); 
        }

    }
}
