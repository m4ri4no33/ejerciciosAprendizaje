/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_8_ejercicio_2_cafetera;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class Guia_8_ejercicio_2_cafetera {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(1000, 0);
        CafeteraServicio nueva = new CafeteraServicio();
        int op = 0;

        while (op != 5) {
            System.out.println();
            System.out.println("MENU CAFETERA");
            System.out.println("1. LLENAR CAFETERA");
            System.out.println("2. SERVIR TAZA");
            System.out.println("3. VACIAR CAFETERA");
            System.out.println("4. AGREGAR CAFE");
            System.out.println("5. SALIR");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    nueva.llenarCafetera(cafetera);
                    break;
                case 2:
                    nueva.servirTaza(cafetera);
                    break;
                case 3:
                    nueva.vaciarCafetera(cafetera);
                case 4:
                    nueva.agregarCafe(cafetera);
                case 5:
                    System.out.println("GRACIAS POR UTILIZAR LA CAFETERA");
                default:
                    System.out.println("INGRESE OPCION VALIDA");
            }
        }

    }

}
