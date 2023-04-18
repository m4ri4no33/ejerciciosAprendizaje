/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_arreglosenjava_ejercicios;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_5_arreglosEnJava_ejercicios {

    /* Realizar un algoritmo que llene un vector con los 100 
primeros números enteros y los muestre por pantalla en orden 
descendente.*/
    public static void main(String[] args) {
        // crea y dimenciona vector
        int[] vector = new int[100];
        // escribir vector
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        // mostrar vector orden ascendente
        for (int i = 0; i < 100; i++) {
             System.out.println("[" + vector[i] + "]");
         }
        // mostrar vector orden descendente
        for (int i = 99 ; i >= 0; i--) {
            System.out.println("[" + vector[i] + "]");
        }

    }
}
