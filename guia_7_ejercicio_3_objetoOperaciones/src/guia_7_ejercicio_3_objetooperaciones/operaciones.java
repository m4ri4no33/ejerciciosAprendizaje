/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_ejercicio_3_objetooperaciones;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class operaciones {

    private int numero1;
    private int numero2;
    private int suma, resta, multiplicar;
    private double dividir;

    public operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public operaciones() {
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void crearOperacion() {
        Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese dos valores");
        numero1 = Leer.nextInt();
        numero2 = Leer.nextInt();
    }

    public int suma() {
        suma = numero1 + numero2;
        return suma;
    }

    public int resta() {
        resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar() {
        multiplicar = numero1 * numero2;
        return multiplicar;
    }

    public double dividir() {
        dividir = (double)numero1 / numero2;
        return dividir;
    }

    @Override
    public String toString() {
        return "operaciones{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", suma=" + suma + ", resta=" + resta + ", multiplicar=" + multiplicar + ", dividir=" + dividir + '}';
    }

}
