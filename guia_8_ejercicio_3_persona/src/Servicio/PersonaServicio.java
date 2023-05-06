/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor
menor que 20, significa que la persona está por debajo de su peso ideal y la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que la persona está en su peso ideal y la función devuelve
un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa
que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;


/*
 * @author Mariano Benegas
 */
public class PersonaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public Persona creaPersona() {
        Persona nueva = new Persona();

        System.out.println("Ingrese su nombre completo");
        nueva.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        nueva.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese genero H-hombre, M-mujer, O-otro");
        nueva.setGenero(leer.nextLine().charAt(0));
        while (nueva.getGenero() != 'H' && nueva.getGenero() != 'M' && nueva.getGenero() != 'O') {
            System.out.println("Genero incorrecto , ingrese nuevamente");
            nueva.setGenero(leer.nextLine().charAt(0));
        }
        System.out.println("Ingrese su peso actual en Kg ejem: 81,50");
        nueva.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura en Mtr ejem: 1,83");
        nueva.setAltura(leer.nextDouble());
        leer.nextLine();

        return nueva;

    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        int aux = 2;
        if (imc < 20) {
            aux = -1;
            System.out.println("Su peso es menor al ideal");

        }
        if (imc >= 20 && imc <= 25) {
            aux = 0;
            System.out.println("Su peso es el ideal");

        }
        if (imc > 25) {
            aux = 1;
            System.out.println("Su peso es mayor, esta en sobrepeso");

        }
        return aux;
    }
   

}
