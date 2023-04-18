/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el
uso de la sentencia break.
 */
package manosalaobra_ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class ManosALaObra_ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int cont = 0;
        do {
            System.out.println("Ingrese un valor");
            num = Leer.nextInt();
            //  suma = suma + num;
            cont++;
            if (num > 0) {
                suma = suma + num;              
            }
        } while ((num != 0) && (cont < 21));
        System.out.println("Se capturo el numero 0");

        System.out.println("La sum de los numeros es: " + suma);

    }
}
