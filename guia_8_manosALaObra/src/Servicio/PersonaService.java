/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class PersonaService {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona creaPersona() {
        System.out.println("Ingrese nombre");
        String nombre = leer.next();
        System.out.println("Ingrese apellido");
        String apellido = leer.next();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();

        return new Persona(nombre, apellido, edad);
    }
    
}
