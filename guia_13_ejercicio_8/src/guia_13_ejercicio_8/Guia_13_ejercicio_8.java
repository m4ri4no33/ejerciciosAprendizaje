/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_13_ejercicio_8;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_13_ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(metodo1());

            System.out.println(metodo2());

            System.out.println(metodo3());
        } catch (Exception e) {
            System.err.println(
                    "Excepcion en metodo() ");
            e.printStackTrace();
        }
    }

    private static int metodo1() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor final del try :" + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch  :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println(
                "Valor antes del return: " + valor);
        return valor;
    }

    private static int metodo2() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt(
                    "42");
            System.out.println("Valor final del catch :" + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    private static int metodo3() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch: " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
        valor = valor + 1;
        System.out.println(
                "Valor antes del return: " + valor
        );
        return valor;
    }

}
