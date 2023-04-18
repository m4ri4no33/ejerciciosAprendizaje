package guia_3_ejercicios;

import java.util.Scanner;

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
public class ejercicio_6_menuOperacionesMatematicas {

    public static void main(String[] args) {
        //DEFINIR VARIABLES E INICIALIZAR
        int num1, num2, opcion;
        int suma = 0;
        int resta = 0;
        int multip = 0;
        float divis = 0;
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
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("RESULTADO : " + suma);
                    continue;
                case 2:
                    resta = num1 - num2;
                    System.out.println("RESULTADO : " + resta);
                    break;
                case 3:
                    multip = num1 * num2;
                    System.out.println("RESULTADO : " + multip);
                    break;
                case 4:
                    divis = num1 / num2;
                    System.out.println("RESULTADO : " + divis);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa S/N?");
                    respuesta = Leer.nextLine();
                    break;
            }

        } while (respuesta.equalsIgnoreCase("S"));

    }

}
