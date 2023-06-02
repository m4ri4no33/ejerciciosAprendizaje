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
package Servicio;

import Entidad.TiendaHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class TiendaServicio {

    private HashMap<String, TiendaHashMap> productos; // Creo EL MAPA
    private Scanner leer;

    public TiendaServicio() {
        this.productos = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    public void cargarArticulo() {

        System.out.println("INGRESE NOMBRE ARTICULO");
        String articulo = leer.next();
        System.out.println("INGRESE TIPO / RUBRO");
        String tipo = leer.next();
        System.out.println("INGRESE VALOR TIPO REFERENCIA : 10,00");
        Double precio = leer.nextDouble();

        productos.put(articulo, new TiendaHashMap(articulo, tipo, precio));

    }

    public void cambiarPrecio() {

        System.out.println("INGRESE ARTICULO A MODIFICAR");
        String aux = leer.next();
        TiendaHashMap auxE;

        for (Map.Entry<String, TiendaHashMap> entry : productos.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(aux)) {
                auxE = entry.getValue();
                System.out.println("INGRESE VALOR ACTUALIZADO");
                auxE.setPrecio(leer.nextDouble());
                productos.put(entry.getKey(), auxE);
            }
            //String key = entry.getKey();
            //TiendaHashMap value = entry.getValue();

        }
    }

    public void eliminarArticulo() {

        System.out.println("INGRESE ARTICULO A ELIMINAR");
        productos.remove(leer.next());

    }

    public void mostrarTodos() {

        for (Map.Entry<String, TiendaHashMap> entry : productos.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
        System.out.println("");
    }
}
