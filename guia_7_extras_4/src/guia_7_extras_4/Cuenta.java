/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo
después de realizar una transacción de retiro.

 */
package guia_7_extras_4;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Cuenta {

    public int saldo = 999;
    public String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void retirarDinero() {
        int resta;
        int aux = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese monto a extraer");
        resta = leer.nextInt();
        if (resta <= saldo) {
            aux = saldo - resta;
            System.out.println("Saldo: " + aux);
        } else {
            System.out.println("No puede extaer su saldo es: " + saldo);
        }
    }
}
