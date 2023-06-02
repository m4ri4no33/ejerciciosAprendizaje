/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen 
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se 
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los
países guardados en el conjunto. (Recordemos hacer los servicios en la clase
correspondiente) 
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un 
Iterator, se buscará el país en el conjunto y si está en el conjunto se 
eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país
no se encuentra en el conjunto se le informará al usuario.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class PaisesServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void guardarPais(HashSet<String> paises) {

        String pais, op;
        do {
            System.out.println("INGRESE UN PAIS A GUARDAR");
            pais = leer.next();
            paises.add(pais);

            do {
                System.out.println("DESEA GUARDAR OTRO PAIS: S/N :");
                op = leer.next().toUpperCase();
                if (null == op) {
                    System.out.println("INGRESE NUEVAMENTE");
                } else {
                    switch (op) {
                        case "N":
                            System.out.println("GRACIAS A CONTINUACION MOSTRAMOS "
                                    + "LOS PAISES GUARDADOS");
                            break;
                        case "S":
                            System.out.println("CONTINUEMOS");
                            break;
                        default:
                            System.err.println("INGRESE NUEVAMENTE");
                            break;
                    }
                }
            } while (!"N".equals(op) && !"S".equals(op));
        } while ("S".equals(op));
        System.out.println("CONJUNTO");
        System.out.println(paises);
    }

    public void ordenar(HashSet<String> paises) {

        ArrayList<String> orden = new ArrayList<>(paises);
        Collections.sort(orden);
        System.out.println("MOSTRAMOS LOS PAISES ORDENADOS ALFABETICAMENTE");
        System.out.println(orden);
    }

    public void eliminar(HashSet<String> paises) {

        Iterator<String> it = paises.iterator();
        System.out.println("INGRESE QUE PAIS DESEA ELIMINAR DE LA LISTA");
        String borrar = leer.next();
        int cont = 0;

        while (it.hasNext()) {

            if (it.next().equalsIgnoreCase(borrar)) {

                it.remove();
                System.out.println("---------------------------------");
                System.out.println("LISTA CON EL ITEM BORRADO");
                System.out.println(paises);

            } else {
                cont++;
            }
        }
        if (paises.size() == cont) {
            System.out.println("NO SE ENCONTRO ITEM A BORRAR");
        }
        //System.out.println("---------------------------------");
        //System.out.println("LISTA CON EL ITEM BORRADO");
        //System.out.println(paises);
        System.out.println(paises);
    }

}
