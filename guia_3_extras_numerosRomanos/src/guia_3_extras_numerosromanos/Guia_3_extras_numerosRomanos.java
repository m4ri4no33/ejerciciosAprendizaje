package guia_3_extras_numerosromanos;

import java.util.Scanner;

/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
y se muestre su equivalente en romano.
 * @author Mariano Benegas
 */
public class Guia_3_extras_numerosRomanos {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = Leer.nextInt();

        if (num == 1) {
            System.out.println("en romanos: I");
        }
        if (num == 2) {
            System.out.println("en romanos: II");
        }
        if (num == 3) {
            System.out.println("en romanos: III");
        }
        if (num == 4) {
            System.out.println("en romanos: IV");
        }
        if (num == 5) {
            System.out.println("en romanos: V");
        }
        if (num == 6) {
            System.out.println("en romanos: VI");
        }
        if (num == 7) {
            System.out.println("en romanos: VII");
        }
        if (num == 8) {
            System.out.println("en romanos: VIII");
        }
        if (num == 9) {
            System.out.println("en romanos: IX");
        }
        if (num == 10) {
            System.out.println("en romanos: X");
        }

    }

}
