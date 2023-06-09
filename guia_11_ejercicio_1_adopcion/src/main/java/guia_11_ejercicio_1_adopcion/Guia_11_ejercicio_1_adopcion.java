/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar
de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
y la clase Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a 
tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y
por ultimo, mostrar desde la clase Persona, la información del Perro y de la 
Persona.
 */
package guia_11_ejercicio_1_adopcion;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_11_ejercicio_1_adopcion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        //Persona nueva = new Persona();
        String resp;
        do {
            Persona nueva = new Persona();
            System.out.println("INGRESE SU NOMBRE");
            nueva.setNombre(leer.next());
            System.out.println("INGRESE SU APELLIDO");
            nueva.setApellido(leer.next());
            System.out.println("INGRESE EDAD");
            nueva.setEdad(leer.nextInt());
            System.out.println("INGRESE SU NUMERO DE DNI");
            nueva.setDocumento(leer.nextInt());

            personas.add(nueva);
            System.out.println("DESEA AGREGAR OTRA PERSONA S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

        System.out.println("-------------------------------------------");

        System.out.println("CONTINUE INGRESANDO PERROS");

        do {

            Perro nuevo = new Perro();
            System.out.println("INGRESE NOMBRE DEL PERRO");
            nuevo.setNombre(leer.next());
            System.out.println("INGRESE LA RAZA");
            nuevo.setRaza(leer.next());
            System.out.println("INGRESE LA EDAD");
            nuevo.setEdad(leer.nextInt());
            System.out.println("INGRESE TAMAÑO CHICO/MEDIANO/GRANDE");
            nuevo.setTamaño(leer.next());

            perros.add(nuevo);
            System.out.println("DESEA AGREGAR OTRO PERRO S/N");
            resp = leer.next();
        } while (resp.equalsIgnoreCase("S"));

        System.out.println("-------------------------------------------");

        for (Persona aux : personas) {
            System.out.println(aux);
            System.out.println("SELECCIONE UN PERRO A ADOPTAR");
            for (Perro perro : perros) {
                System.out.println(perro.getNombre());
            }
            String eleccion = leer.next();
            for (Perro perro : perros) {
                if (eleccion.equalsIgnoreCase(perro.getNombre())) {
                    aux.setPerro(perro);
                }

            }

        }
        System.out.println("-------------------------------------------");
        for (Persona nuevas : personas) {

            System.out.println(nuevas);
        }

    }

}
