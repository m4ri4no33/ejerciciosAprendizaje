/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_11_manosalaobra;

import Entidad.Dni;
import Entidad.Persona;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_11_manosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Persona nueva = new Persona();

        System.out.println("INGRESE SU NOMBRE");
        nueva.setNombre(leer.next().toUpperCase());
        System.out.println("INGRESE SU APELLIDO");
        nueva.setApellido(leer.next().toUpperCase());
        System.out.println("INGRESE EL NUMERO DE DNI SEGUIDO DEL TIPO");
        System.out.println("TIPO DNI EJEMPLO : RUT - R / DNI - D / PASAPORTE - P ");
        nueva.setDni(new Dni(leer.nextInt(), leer.next()));

        System.out.println(nueva.toString());

    }

}
