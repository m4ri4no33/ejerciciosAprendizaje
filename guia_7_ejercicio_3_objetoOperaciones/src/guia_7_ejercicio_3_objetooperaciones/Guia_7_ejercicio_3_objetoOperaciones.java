package guia_7_ejercicio_3_objetooperaciones;

import Operaciones.Operaciones;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 * @author Mariano Benegas
 */
public class Guia_7_ejercicio_3_objetoOperaciones {
//         Libro Libro1 = new Libro();// creamos un nuevo objeto
//        System.out.println("Ingrese ISBN");
//        Libro1.ISBN = Leer.nextInt();// darle un vvalor por teclado en main a la clase libro

    public static void main(String[] args) {

        operaciones num = new operaciones();// creamos un nuevo objeto

        num.crearOperacion();// darle un vvalor por teclado en main a la clase libro
        num.suma();
        num.resta();
        num.multiplicar();
        num.dividir();
        System.out.println(num.toString());
    }

}
