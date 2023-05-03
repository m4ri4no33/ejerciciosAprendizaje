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
import java.io.PrintStream;

/*
 * @author Mariano Benegas
 */
public class Guia_8_ejercicio_1_cuentaBancaria {

    public static void main(String[] args) {
        
        
        CuentaBancariaServicio rtr = new CuentaBancariaServicio();

        rtr.crearCuentaBancaria();

        rtr.ingresaDinero();
        double cuenta = rtr.ingresaDinero();
        
        System.out.println("Su saldo es: " + cuenta);

        rtr.retiraDinero();
        rtr.extraccionRapida();
    }

}
