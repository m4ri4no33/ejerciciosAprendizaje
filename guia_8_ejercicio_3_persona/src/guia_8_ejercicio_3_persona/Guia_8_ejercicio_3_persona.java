/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos
todos los métodos para cada objeto, deberá comprobar si la persona está en su 
peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para 
cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas
4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos,
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores. Para esto, podemos crear unos métodos adicionales.

 */
package guia_8_ejercicio_3_persona;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_8_ejercicio_3_persona {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio nueva = new PersonaServicio();
        Persona primera = nueva.creaPersona();
        Persona segunda = nueva.creaPersona();
        Persona tercera = nueva.creaPersona();
        Persona cuarta = nueva.creaPersona();

    }

}
