/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar 
su precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia_10_ejercicio_6_tienda;

import Servicio.TiendaServicio;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_10_ejercicio_6_tienda {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        TiendaServicio tiendaSer = new TiendaServicio();
        
        int op = 0;

        while (op != 5) {

            System.out.println("--------MENU APP TIENDA--------");
            System.out.println("INGRESE UNA OPCION PARA OPERAR");
            System.out.println("1- CARGAR ARTICULO");
            System.out.println("2- ELIMINAR ARTICULO");
            System.out.println("3- MODIFICAR PRECIO");
            System.out.println("4- MOSTRAR LISTA ARTICULOS C/PRECIO");
            System.out.println("5- SALIR");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    tiendaSer.cargarArticulo();
                    break;
                case 2:
                    tiendaSer.eliminarArticulo();
                    break;
                case 3:
                    tiendaSer.cambiarPrecio();
                    break;
                case 4:
                    tiendaSer.mostrarTodos();
                    break;
                case 5:
                    System.out.println("-------FINALIZA LA CARGA-------");
                    break;
                default:
                    System.out.println("OPCION INVALIDA, INGRESE NUEVAMENTE");

            }

        }

    }
}
