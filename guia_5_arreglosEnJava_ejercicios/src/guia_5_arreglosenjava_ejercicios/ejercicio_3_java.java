/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_arreglosenjava_ejercicios;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_3_java {

    /*Recorrer un vector de N enteros contabilizando cuántos
    números son de 1 dígito, cuántos de 2 dígitos, etcétera 
    (hasta 5 dígitos).
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar tamaño de vector");
        int dim = leer.nextInt();
        int num = 0;

        int unDig = 0, dosDig = 0, tresDig = 0, cuatroDig = 0, cincoDig = 0;

        int[] vector = new int[dim]; //DIMENSIONA

        for (int i = 0; i < dim; i++) {
            vector[i] = (int) (Math.random() * 99999);
        }
        for (int i = 0; i < dim; i++) {
            String cifras = Integer.toString(vector[i]);
            int longitud = cifras.length();
            switch (longitud) {
                case 1:
                    unDig++;
                    break;
                case 2:
                    dosDig++;
                    break;
                case 3:
                    tresDig++;
                    break;
                case 4:
                    cuatroDig++;
                    break;
                case 5:
                    cincoDig++;
                    break;
            }
        }
        for (int i = 0; i < dim; i++) {
            System.out.println("[" + vector[i] + "]");

        }
        System.out.println("Se encotró " + unDig + " numeros de un Digito.");
        System.out.println("Se encotró " + dosDig + " numeros de dos Digitos.");
        System.out.println("Se encotró " + tresDig + " numeros de tres Digitos.");
        System.out.println("Se encotró " + cuatroDig + " numeros de cuatro Digito.");
        System.out.println("Se encotró " + cincoDig + " numeros de cinco Digito.");
    }
}
