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
        //Persona nuevaPersona = nueva.creaPersona();
        int resIMC, cont = 0, pI = 0, sp = 0, vp = 0, menores = 100;

        Persona[] persona = new Persona[4];
        
        for (int i = 0; i <= 3; i++) {
            persona[i] = nueva.creaPersona();
            resIMC = nueva.calcularIMC(persona[i]);
            if (nueva.esMayorDeEdad(persona[i])) {
                cont++;
            }
            if (resIMC == 0) {
                pI++;
            }
            if (resIMC == 1) {
                sp++;
            }
            if (resIMC == -1) {
                vp++;
            }

        }
        cont = cont * 100 / 4;
        menores = menores - cont;
        System.out.println("La cantidad de mayores de edad es: " + cont + "% y " + menores + "% menores de edad");
        pI = pI * 100 / 4;
        sp = sp * 100 / 4;
        vp = vp * 100 / 4;
        System.out.println("El " + pI + "% esta en su peso ideal");
        System.out.println("El " + sp + "% esta en sobrepeso");
        System.out.println("El " + vp + "% esta por debajo de su peso");
        
        
        // ejercicio Excepcion Persona Null.
        persona [2] = null;
        
        try{
            nueva.esMayorDeEdad(persona [2]);
        } catch(NullPointerException aux){
            System.out.println("getMessage: " + aux.getMessage());
        }

    }

}
