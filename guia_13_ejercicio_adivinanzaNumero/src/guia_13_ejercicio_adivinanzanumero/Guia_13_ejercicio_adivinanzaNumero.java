/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package guia_13_ejercicio_adivinanzanumero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_13_ejercicio_adivinanzaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Random random = new Random();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numeroU = 0, numPc = 0 ;
        
        numPc =  random.nextInt(500)+1;
    
        
        System.out.println("numeroPc = " + numPc);
        int i = 0;

        do {
            System.out.println("Ingrese un numero");
            i++;
            try {
                System.out.println();
                numeroU = leer.nextInt();

                if (numeroU < numPc) {
                    System.out.println("El numero es mayor");
                } else if (numeroU == numPc) {
                    System.out.println("Has adivinado!!");
                    break;
                } else {
                    System.out.println("El numero es menor");
                }
} catch (InputMismatchException e) {
                System.out.println("Dato incorrecto " + e.getMessage());
                            leer.next();

            }
//            numeroUsuario = 0;
            System.out.println("Intentos realizados: " + i);
            System.out.println("numeroUsuario = " + numeroU);
        } while (numeroU != numPc);
    }
}