/* Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar
mediante otro método el número de ISBN, el título, el autor del libro 
y el número de páginas.
*/

package guia_7_ejercicio1_objetos;

import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_7_ejercicio1_objetos {
 
    public static void main(String[] args) {
        Scanner Leer = new Scanner( System.in);
        
        Libro Libro1 = new Libro();// creamos un nuevo objeto
        System.out.println("Ingrese ISBN");
        Libro1.ISBN = Leer.nextInt();// darle un vvalor por teclado en main al atributo de la clase libro
        System.out.println("Ingrese Titulo");
        Libro1.titulo = Leer.next();
        System.out.println("Ingrese Autor");
        Libro1.autor = Leer.next();
        System.out.println("Ingrese Numeros de paginas");
        Libro1.numeroPaginas = Leer.nextInt();
        
        System.out.println(Libro1.toString());
        
        
    }
    
}
