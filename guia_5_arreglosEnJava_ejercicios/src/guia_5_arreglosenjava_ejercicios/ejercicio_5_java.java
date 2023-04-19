/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5_arreglosenjava_ejercicios;

import java.util.Random;

/**
 *
 * @author Mariano Benegas
 */
public class ejercicio_5_java {

    /*
    Realice un programa que compruebe si una matriz dada es antisimétrica.
    Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
    traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
    si A = -AT. La matriz traspuesta de una matriz A se denota por AT y
    se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        int[][] matrizS = new int[4][4];
        int[][] matriz = new int[4][4];
        int[][] matrizT = new int[4][4];
        Random otro = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = otro.nextInt(21) - 10;
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("*********");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizT[i][j] = (matriz[i][j]) * -1;
                System.out.print("[" + matrizT[i][j] + "]");

            }
            System.out.println("");
        }
        for (int i = 0; i < 4; i++) {
            for (int j= 0; j < 4; j++) {
                matrizS[i][j] = matrizS[i][j] + matrizT[i][j];
                System.out.print("[" + matrizS[i][j] + "]");
            }
        }
        System.out.println("");
    }

}
