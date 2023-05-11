/*
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
package Servicio;

import Entidad.ParDeNumeros;

/*
 * @author Mariano Benegas
 */
public class ParDeNumerosServicio {
    
    public void mostrarValores(ParDeNumeros numeros){
        System.out.println("LOS VALORES SON");
        System.out.println("NUMERO 1: " + numeros.getN1());
        System.out.println("NUMERO 2: " + numeros.getN2());
    }
    
    public void devolverMayor(ParDeNumeros numeros){
        String retorno = (numeros.getN1()> numeros.getN2()) ? " el Primer valor es: " : "el segundo valor es: ";
        System.out.println(retorno);
        }
    }
    

    

