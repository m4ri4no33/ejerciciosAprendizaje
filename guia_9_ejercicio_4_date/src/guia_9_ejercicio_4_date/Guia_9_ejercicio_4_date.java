/*
 Clase Date
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService,
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
de años entre una y otra (edad del usuario).

 */
package guia_9_ejercicio_4_date;

import Servicio.FechaService;
import java.util.Date;

/*
 * @author Mariano Benegas
 */
public class Guia_9_ejercicio_4_date {

    public static void main(String[] args) {
        FechaService fecha = new FechaService();
        // Date actual = fecha.fechaActual();
        // fecha.fechaNacimiento();
        // System.out.println("LA FECHA ACTUAL ES:");
        //System.out.println(fecha.fechaActual());
        //System.out.println("USTED TIENE LA EDAD DE:");
        //System.out.println(fecha.diferencia(fechaActual, fechaNaci));
        int anios = fecha.diferencia(fecha.fechaActual(),fecha.fechaNacimiento());
        System.out.println(anios);
        
    
    }
    
}
