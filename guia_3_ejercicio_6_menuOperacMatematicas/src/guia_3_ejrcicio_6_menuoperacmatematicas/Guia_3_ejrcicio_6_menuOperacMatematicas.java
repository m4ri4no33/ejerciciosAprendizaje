package guia_3_ejrcicio_6_menuoperacmatematicas;

import java.util.Scanner;

public class Guia_3_ejrcicio_6_menuOperacMatematicas {

    /*Realizar un programa que pida dos números enteros positivos por 
teclado y muestre por pantalla el siguiente menú:El usuario deberá 
elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija
la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
en vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
@author Mariano Benegas
     */
    public static void main(String[] args) {
        //DEFINIR VARIABLES E INICIALIZAR
        int num1, num2, opcion, aux = 5;
        String respuesta;

        //SOLICITAR NUMEROS POR TECLADO Y LEERLOS
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        num1 = Leer.nextInt();
        num2 = Leer.nextInt();

        //MENU DE OPERACIONES 
        do {

            System.out.println("MENU");
            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - SALIR");
            System.out.println("ELIJA OPCION: ");
            opcion = Leer.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("ELIJA UNA OPCION VALIDA ");
            } else {
                switch (opcion) {
                    case 1:
                        System.out.println("La suma es igual a " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("RESULTADO : " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("RESULTADO : " + (num1 * num2));
                        break;
                    case 4:
                        System.out.println("RESULTADO : " + (num1 / num2));
                        break;
                    case 5:
                        Scanner salida = new Scanner(System.in);
                        System.out.println("¿Esta seguro que desea salir del programa S/N?");
                        respuesta = salida.nextLine();

                        if (respuesta.equalsIgnoreCase("S")) {
                            aux = 4;
                            break;
                        }

                }

            }

        } while (aux == 5);

    }

}
