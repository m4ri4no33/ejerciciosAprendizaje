/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto,tendremos una clase Pelicula con el título, director y duración de 
la película (en horas).Implemente las clases y métodos necesarios para esta 
situación, teniendo en cuenta loque se pide a continuación:
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
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia_10_ejercicio_4_pelicula;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_10_ejercicio_4_pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PeliculaServicio peliServ = new PeliculaServicio();
        ArrayList<Pelicula> nuevaLista = new ArrayList<>();

        peliServ.crearPelicula(nuevaLista);
        //    System.out.println("--------------------------------------");
        //   System.out.println("LAS SIGUIENTES PELICULAS TIENEN "
        //           + "UNA DURACION MAYOR A 1 HORA");
        peliServ.mayorDuracion(nuevaLista);
        //    System.out.println("--------------------------------------");
        //    System.out.println("PELICULAS EN ORDEN DE MAYOR A MENOR");
        peliServ.ordenMayorAMenor(nuevaLista);
        //    System.out.println("--------------------------------------");
        //    System.out.println("PELICULAS EN ORDEN DE MENOR A MAYOR");
        peliServ.ordenMenorAMayor(nuevaLista);
        //    System.out.println("--------------------------------------");
        //    System.out.println("PELICULAS EN ORDEN ALFABETICO POR TITULO");
        peliServ.ordenTitulo(nuevaLista);
        //     System.out.println("--------------------------------------");

        peliServ.ordenDirector(nuevaLista);

    }

}
