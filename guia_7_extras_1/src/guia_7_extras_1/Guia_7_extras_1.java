/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extras_1;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_7_extras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion nueva = new Cancion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la cancion");
        nueva.titulo = leer.next();
        System.out.println("Ingrese autor");
        nueva.autor = leer.next();

        System.out.println("La cancion se llama " + nueva.titulo + " su autor es " + nueva.autor);
    }

}
