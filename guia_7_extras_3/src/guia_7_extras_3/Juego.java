/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7_extras_3;

import java.util.Scanner;

/**
 *
 */
public class Juego {

    public int numJugador1;
    public int numJugador2;
    public int intentos = 3;

    public Juego() {
    }

    public void iniciar_juego() {
        Scanner lp = new Scanner(System.in);
        System.out.println("Jugador 1 elija un numero ");
        numJugador1 = lp.nextInt();

    }

    public void proceso() {
        int con = 1;
        int gJ2 = 0;
        int gJ1 = 0;
        boolean gano = false;

        Scanner lp = new Scanner(System.in);
        do {
            System.out.println("Jugador dos elija un numero de 0-10 para adivinar");
            numJugador2 = lp.nextInt();
            if (numJugador1 == numJugador2) {
                gano = true;
                ++gJ2;
                break;
            } else if (numJugador1 < numJugador2) {
                System.out.println(" mas bajo ");
                ++con;
                ++gJ1;
            } else {
                System.out.println("Mas alto");
                ++con;
                ++gJ1;
            }

        } while (con < 4);
        if (con < 4) {
            System.out.println("El jugador 2 Gano con " + (gJ1) + " intentos fallidos");
        } else {
            System.out.println("El jugador 2 perdio con " + (gJ1) + " intentos fallidos");
        }

    }
}
