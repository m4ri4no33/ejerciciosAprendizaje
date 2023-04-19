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
public class ejercicio_4_java {

    /*Realizar un programa que rellene un matriz de 4 x 4 
    de valores aleatorios y muestre la traspuesta de la matriz.
    La matriz traspuesta de una matriz A se denota por B y se obtiene 
    cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int[][] matrizt = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("*********");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                matrizt[i][j] = matriz[i][j];
                System.out.print("[" + matrizt[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.print("[" + matriz[0][1] + "]");
        System.out.print("[" + matrizt[0][1] + "]");
    }

    //  System.out.print ("[" + matriz[0][1] + "]");
}
