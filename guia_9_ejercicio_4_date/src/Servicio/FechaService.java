/*
 Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
de años entre una y otra (edad del usuario).
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class FechaService {

    public Date fechaActual;

    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        Date fechaNaci = new Date();
        System.out.println("INGRESE SU FECHA DE NACIMIENTO FORMATO DD/MM/AAAA");
        fechaNaci.setDate(leer.nextInt());
        fechaNaci.setMonth(leer.nextInt() - 1);
        fechaNaci.setYear(leer.nextInt() - 1900);
        System.out.println("LA FECHA INGRESADA ES: ");
        System.out.println(fechaNaci);
        return fechaNaci;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date actual, Date fechaNaci) {

        int diferencia = actual.getYear() - fechaNaci.getYear();

        if (actual.getMonth() <= fechaNaci.getMonth()) {
            if (actual.getMonth() == fechaNaci.getMonth()) {
                if (fechaNaci.getDate() > actual.getDate()) {
                    diferencia--;
                }
            } else {
                diferencia--;
            }
        }
        return diferencia;
    }

}
