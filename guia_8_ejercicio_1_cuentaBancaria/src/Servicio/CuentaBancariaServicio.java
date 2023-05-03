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

        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese numero dni");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese monto que sera su saldo actual");
        cuenta.setSaldoActual(leer.nextInt());
        return cuenta;
    }

    public void ingresaDinero(CuentaBancaria cuenta) {
        double monto;
        System.out.println("Ingrese monto a depositar");
        monto = leer.nextDouble();
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += monto;
        cuenta.setSaldoActual(saldoActual);
        // return saldoActual;

    }

    public void retiraDinero(CuentaBancaria cuenta) {
        double monto;
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Ingrese el monto a extraer");
        monto = leer.nextDouble();

        if (monto <= saldoActual) {
            saldoActual -= monto;
            cuenta.setSaldoActual(saldoActual);
        } else {
            System.out.println("El monto a extraer es superior al saldo " + saldoActual);
            System.out.println("El maximo a extraer es de " + saldoActual);
            cuenta.setSaldoActual(0);

        }

    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Cuanto dinero desea retirar?");
        double retiro = leer.nextDouble();
        double saldo = cuenta.getSaldoActual() * 0.20;

        if (retiro <= saldo) {
            System.out.println("Procesando solicitud. Aguarde por favor...");
            saldo = cuenta.getSaldoActual();
            saldo -= retiro;
            cuenta.setSaldoActual(saldo);
            System.out.println("Operacion realizada con exito. Su saldo actual es de: " + cuenta.getSaldoActual() + "$");
        } else {
            System.out.println("El monto solicitado es mayor al 20% de su saldo. ");
            System.out.println("Por favor ingrese a la opcion 2. Retirar dinero.");
        }

    }

    public double consultaSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldoActual();
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("NUMERO DE CUENTA " + cuenta.getNumeroCuenta());
        System.out.println("DNI CLIENTE " + cuenta.getDniCliente());
        System.out.println("SALDO ACTUAL " + cuenta.getSaldoActual());
    }

}
