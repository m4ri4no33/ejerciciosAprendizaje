/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole 
al usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al
usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantall
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class PeliculaServicio {

    // private ArrayList<Pelicula> nuevaLista;
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> nuevaLista) {
        String op;

        do {
            System.out.println("HOLA A CONTINUACION INGRESE LOS DATOS");
            System.out.println("SOLICITADOS PARA GUARDAR UNA PELICULA");
            System.out.println("PRIMERO - INGRESE EL TITULO DE LA PELICULA");
            System.out.println("SEGUNDO - INGRESE NOMBRE DEL DIRECTOR");
            System.out.println("TERCERO - INGRESE EL TIEMPO DE DURACION EN MINUTOS");
            nuevaLista.add(new Pelicula(leer.next(), leer.next(), leer.nextDouble()));

            do {
                System.out.println("DESEA GUARDAR OTRA PELICULA: S/N :");
                op = leer.next().toUpperCase();
                if (null == op) {
                    System.out.println("INGRESE NUEVAMENTE");
                } else {
                    switch (op) {
                        case "N":
                            System.out.println("GRACIAS, NO SE GUARDO MAS PELICULAS");
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

        System.out.println("LISTA DE PELICULAS");
        System.out.println(nuevaLista);
    }

    public void mayorDuracion(ArrayList<Pelicula> nuevaLista) {

        Iterator<Pelicula> it = nuevaLista.iterator();
        System.out.println("LAS SIGUIENTES PELICULAS TIENEN "
                + "UNA DURACION MAYOR A 1 HORA");

        while (it.hasNext()) {
            Pelicula aux = it.next();
            if (aux.getDuracion() >= 60) {
                System.out.println(aux);
            }

        }

    }

    public void ordenMayorAMenor(ArrayList<Pelicula> nuevaLista) {

        nuevaLista.sort(Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        System.out.println("PELICULAS EN ORDEN DE MAYOR A MENOR");
        System.out.println(nuevaLista);
    }

    public void ordenMenorAMayor(ArrayList<Pelicula> nuevaLista) {

        nuevaLista.sort(Comparator.comparingDouble(Pelicula::getDuracion));
        System.out.println("PELICULAS EN ORDEN DE MENOR A MAYOR");
        System.out.println(nuevaLista);
    }

    public void ordenTitulo(ArrayList<Pelicula> nuevaLista) {
        System.out.println("PELICULAS EN ORDEN ALFABETICO POR TITULO");
        nuevaLista.sort(Comparator.comparing(Pelicula::getTitulo));

        System.out.println(nuevaLista);
    }

    public void ordenDirector(ArrayList<Pelicula> nuevaLista) {
        System.out.println("PELICULAS EN ORDEN ALFABETICO SEGUN DIRECTOR");
        nuevaLista.sort(Comparator.comparing(Pelicula::getDirector));

        System.out.println(nuevaLista);
    }

}
