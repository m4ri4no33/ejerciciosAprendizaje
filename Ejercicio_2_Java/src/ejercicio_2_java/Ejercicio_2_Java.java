/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2_java;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Ejercicio_2_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
        //lee tecleo 
        Scanner leer = new Scanner(System.in);     
        //pedir nombre
        System.out.println("ingrese su nombre");
        //variable string
        String nombre;
        //guardar variable
        nombre = leer.next();
        //escribir variable        
        System.out.println(nombre);       
    }
    
}
