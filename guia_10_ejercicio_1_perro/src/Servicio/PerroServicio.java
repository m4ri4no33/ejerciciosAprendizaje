/*
  Diseñar un programa que lea y guarde razas de perros en un ArrayList
de tipo String. El programa pedirá una raza de perro en un bucle, el mismo
se guardará en la lista y después se le preguntará al usuario si quiere 
guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
los perros guardados en el ArrayList.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class PerroServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //ArrayList<String> perros = new ArrayList<>();

    public void razaPerro(ArrayList<String> perros) {

        String raza, op;
        do {
            System.out.println("INGRESE LA RAZA DE PERRO A GUARDAR");
            raza = leer.next();
            perros.add(raza);
            OUTER:
            do {
                System.out.println("DESEA GUARDAR OTRA RAZA: S/N :");
                op = leer.next().toUpperCase();
                if (null == op) {
                    System.out.println("INGRESE NUEVAMENTE");
                } else {
                    switch (op) {
                        case "N":
                            System.out.println("GRACIAS A CONTINUACION MOSTRAMOS RAZAS");
                            break OUTER;
                        case "S":
                            System.out.println("CONTINUEMOS");
                            break;
                        default:
                            System.out.println("INGRESE NUEVAMENTE");
                            break;
                    }
                }
            } while (!"N".equals(op) && !"S".equals(op));
        } while ("S".equals(op));
        System.out.println("LISTA DE RAZAS");
        System.out.println(perros);
    }

    /*Continuando el ejercicio anterior, después de mostrar los perros,
al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
se buscará el perro en la lista. Si el perro está en la lista, se 
eliminará el perro que ingresó el usuario y se mostrará la lista ordenada.
Si el perro no se encuentra en la lista, se le informará al usuario y 
se mostrará la lista ordenada.*/
    public void eliminarPerro(ArrayList<String> perros) {
        
        int cont = 0;
        System.out.println("INGRESE RAZA A ELIMINAR");
        String borrar = leer.next();

        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(borrar)) {
                it.remove();
            } else {
                cont++;
                // System.out.println("NO SE ENCONTRO OPCION A BORRAR");
            }

        }
        if (perros.size() == cont) {
            System.out.println("NO SE ENCONTRO OPCION A BORRAR");
        }

        Collections.sort(perros);
        System.out.println(perros);

    }

}
