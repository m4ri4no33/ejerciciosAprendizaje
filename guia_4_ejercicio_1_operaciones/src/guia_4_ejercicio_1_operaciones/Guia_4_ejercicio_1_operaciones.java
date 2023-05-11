/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
para cada operación matemática y deben devolver sus resultados para imprimirlos
en el main. 
 */
package guia_4_ejercicio_1_operaciones;

import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Guia_4_ejercicio_1_operaciones {

    public static void main(String[] args) {

        int A, B, retorno;

        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE VALOR PARA OPERAR A - B");
        A = leer.nextInt();
        B = leer.nextInt();

        System.out.println("MENU OPERACIONES");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR");
        System.out.println("3 MULTIPLICAR");
        System.out.println("4 DIVIDIR");
        int op = leer.nextInt();

        switch (op) {
            case 1:
                retorno = suma(A, B);
                System.out.println("El resultado esperado es: " + retorno);
                break;
            case 2:
                retorno = resta(A, B);
                System.out.println("El resultado esperado es: " + retorno);
                break;
            case 3:
                retorno = multiplicacion(A, B);
                System.out.println("El resultado esperado es: " + retorno);
                break;
            case 4:
                retorno = division(A, B);
                System.out.println("El resultado esperado es: " + retorno);
                break;
            default:
                System.out.println("La opcion no es valida, ingrese correcta");
        }
    }

    public static int suma(int a, int b) {

        int suma = a + b;
        return suma;
    }

    public static int resta(int a, int b) {

        int resultado = a - b;
        return resultado;

    }

    public static int multiplicacion(int a, int b) {

        int resultado = a * b;
        return resultado;

    }

    public static int division(int a, int b) {

        int resultado = a / b;
        return resultado;

    }

}
