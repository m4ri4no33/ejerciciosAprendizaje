/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manosalaobra_ejercicio13;

import java.util.Scanner;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 *
 * @author Mariano Benegas
 */
public class ManosALaObra_ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //creacion vector y dimensiona
        String[] equipo8 = new String[9];
        //rellena vector
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingrese los nombres de su equipo");
            equipo8[i] = leer.next();

        }
        //leemos vector
        for (int i = 0; i < 9; i++) {
            System.out.println("[" + equipo8[i] + "]");
        }

    }
}
