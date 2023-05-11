/*
 Crear una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase, por 
ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra
que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class CadenaServicio {

    private final Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena cadena) {
        int cont = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().substring(i, i + 1);
            if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
                cont++;
            }
        }
        return cont;
    }

    public void invertirFrase(Cadena cadena) {
        
        for (int i = cadena.getLongitud(); i >= 0 ; i--){
            System.out.print(cadena.getFrase().charAt(i));

    }


public void 
    
}
}
