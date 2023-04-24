package guia_3_ejercicios;

import java.util.Scanner;

/*
 Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 @author Mariano Benegas
 */
public class ejercicio_5_vaalorLimite {

    public static void main(String[] args) {
        int limite;
        int valor;
        int suma = 0;
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese valor limite");
        limite = Leer.nextInt();

        for (int i = 0; i < limite; i++) {
            System.out.println("Ingrese valor a sumar");
            valor = Leer.nextInt();
            suma = suma + valor;
            if (suma <= limite) {
                //System.out.print(suma);
            } else {
                System.out.print("La suma supero el limite inicial " + suma);
                break;
            }
            System.out.print(" ");
        }
        
    }

}
