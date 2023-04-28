/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extras_6;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_7_extras_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.lado1 = 4;
        rectangulo1.lado2 = 6;
        System.out.println("El area del rectangulo es " + rectangulo1.calcularArea());
    }

}
