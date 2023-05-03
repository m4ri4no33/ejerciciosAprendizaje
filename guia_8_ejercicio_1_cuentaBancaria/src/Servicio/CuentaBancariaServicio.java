/*
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
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/* 
 * @author Mariano Benegas
 */
public class CuentaBancariaServicio {

    private final Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuentaBancaria() {
        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese numero dni");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese monto que sera su saldo actual");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public double ingresaDinero() {
        CuentaBancaria saldo = new CuentaBancaria();
        double ingreso;
        System.out.println("Ingrese el monto a depositar");
        ingreso = leer.nextDouble();
        return saldo.saldoActual + ingreso;
    }

    public double retiraDinero() {
        CuentaBancaria saldo = new CuentaBancaria();
        double retiro, aux;
        System.out.println("Ingrese el monto a retirar");
        retiro = leer.nextDouble();
        aux = saldo.saldoActual;
        if (retiro < saldo.saldoActual) {            
            
            System.out.println("Su retiro supera el saldo actual se entregara " + aux);
            saldo.saldoActual - aux;
        } else {
            saldo.saldoActual - retiro;
        }

        return saldo.saldoActual;
    }

    public double extraccionRapida() {
        CuentaBancaria saldo = new CuentaBancaria();
        double rapido;
        System.out.println("Ingrese monto a retirar solo podra 20% del saldo");
        rapido = leer.nextDouble();
        if (rapido < ((saldo.saldoActual) / 1.20)) {

        }
        System.out.println("Solo puede retirar el 20% del saldo");
        rapido = leer.nextDouble();
        return;
    }

}
