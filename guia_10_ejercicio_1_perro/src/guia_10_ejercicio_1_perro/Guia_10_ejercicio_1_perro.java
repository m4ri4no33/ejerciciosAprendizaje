/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará 
en la lista y después se le preguntará al usuario si quiere guardar otro perro 
o si quiere salir. Si decide salir, se mostrará todos los perros guardados
en el ArrayList.
 */
package guia_10_ejercicio_1_perro;

import Servicio.PerroServicio;
import java.util.ArrayList;

/*
 * @author Mariano Benegas
 */
public class Guia_10_ejercicio_1_perro {

    public static void main(String[] args) {
        PerroServicio raza = new PerroServicio();
        ArrayList<String> perros = new ArrayList<>();

        raza.razaPerro(perros);
        raza.eliminarPerro(perros);
    }

}
