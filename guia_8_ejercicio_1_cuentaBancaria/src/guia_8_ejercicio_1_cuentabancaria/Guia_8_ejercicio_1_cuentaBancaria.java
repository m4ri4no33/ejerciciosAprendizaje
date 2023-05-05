/*
 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará
al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara
al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package guia_8_ejercicio_1_cuentabancaria;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;


/*
 * @author Mariano Benegas
 */
public class Guia_8_ejercicio_1_cuentaBancaria {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio nueva = new CuentaBancariaServicio();
        CuentaBancaria nuevaCuenta = nueva.crearCuentaBancaria();      
       

        while (opcion != 6) {
            System.out.println();
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Realizar Deposito");
            System.out.println("2. Realizar Retiro");
            System.out.println("3. Realizar Extraccion Rapida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                // case 1:
                //     CuentaBancaria nuevaCuenta = nueva.crearCuentaBancaria();
                //      break;
                case 1:
                    nueva.ingresaDinero(nuevaCuenta);
                    break;
                case 2:
                    nueva.retiraDinero(nuevaCuenta);
                    break;
                case 3:
                    nueva.extraccionRapida(nuevaCuenta);
                    break;
                case 4:
                    nueva.consultaSaldo(nuevaCuenta);
                    System.out.println("SALDO ACTUAL " + nuevaCuenta.getSaldoActual());
                    break;
                case 5:
                    nueva.consultarDatos(nuevaCuenta);
                    break;
                case 6:
                    System.out.println("Gracias por usar el servicio");
                    break;

                default:
                    System.out.println("Opcion invalida, ingrese nuevamente");
                    break;

            }

        }

    }

}
