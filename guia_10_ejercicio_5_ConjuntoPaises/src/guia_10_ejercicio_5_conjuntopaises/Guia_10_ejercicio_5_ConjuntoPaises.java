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
package guia_10_ejercicio_5_conjuntopaises;

import Servicio.PaisesServicio;
import java.util.HashSet;

/*
 * @author Mariano Benegas
 */
public class Guia_10_ejercicio_5_ConjuntoPaises {

    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<>();

        PaisesServicio conj = new PaisesServicio();

        System.out.println("---------------------------------");
        conj.guardarPais(paises);
        System.out.println("---------------------------------");
        conj.ordenar(paises);
        System.out.println("---------------------------------");
        conj.eliminar(paises);
        System.out.println("---------------------------------");

    }

}
