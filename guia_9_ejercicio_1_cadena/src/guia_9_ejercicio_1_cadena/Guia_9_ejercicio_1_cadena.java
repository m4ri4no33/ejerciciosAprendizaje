/*


 */
package guia_9_ejercicio_1_cadena;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_9_ejercicio_1_cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CadenaServicio nuevo = new CadenaServicio();

        System.out.println("INGRESE UNA FRASE");
        Cadena cadena = new Cadena(leer.next());

        System.out.println(nuevo.mostrarVocales(cadena));

    }

}
