/*
 Método Static y Clase Math
Crear una clase 
ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package guia_9_ejercicio_2_pardenumeros;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/*
 * @author Mariano Benegas
 */
public class Guia_9_ejercicio_2_parDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumerosServicio numSer = new ParDeNumerosServicio();
        
        numSer.mostrarValores(numeros);
        numSer.devolverMayor(numeros);
    }
    
}
