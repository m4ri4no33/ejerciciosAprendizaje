/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extras_5;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_7_extras_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                           
        Scanner leer = new Scanner(System.in);
        Empleado nuevo = new Empleado();
        System.out.println("Ingrese su nombre");
        nuevo.nombre = leer.next();
        System.out.println("Ingrese su edad");
        nuevo.edad = leer.nextInt();
        System.out.println("Ingrese su salario");
        nuevo.salario = leer.nextInt();
        nuevo.calcularAumento();
        
       
        System.out.println(nuevo.toString());
    }
    
}
