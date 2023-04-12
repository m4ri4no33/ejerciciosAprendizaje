/*
 Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota
sea correcta.

 */
package manosalaobra_ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ManosALaObra_ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int respuesta = 0;
        System.out.println("Ingrese una nota a validar");
        
        while (respuesta.equalsIgnoreCase(> 0 || < 10)){
            System.out.println("su nota es correcta");
            respuesta = leer.nextInt();
        }
    }
    
}
