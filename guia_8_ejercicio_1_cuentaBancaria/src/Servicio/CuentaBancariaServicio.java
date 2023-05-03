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

    public CuentaBancaria crearCuentaBancaria(CuentaBancaria cuenta) {

        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese numero dni");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese monto que sera su saldo actual");
        double saldoActual = leer.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public double ingresaDinero(CuentaBancaria cuenta, double monto) {

        System.out.println("Ingrese monto a depositar");
        monto = leer.nextDouble();
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += monto;
        cuenta.setSaldoActual(saldoActual);
        return saldoActual;

    }

    public double retiraDinero(CuentaBancaria cuenta, double monto) {

        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Ingrese el monto a extraer");
        monto = leer.nextDouble();

        if (monto <= saldoActual) {
            saldoActual -= monto;
            cuenta.getSaldoActual();
        } else {
            System.out.println("El monto a extraer es superior al saldo "+ saldoActual);
            System.out.println("El maximo a extraer es de "+ saldoActual);
            cuenta.setSaldoActual(0);
            
        }

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

}
