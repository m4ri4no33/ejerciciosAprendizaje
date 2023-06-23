/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Juego {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver = new Revolver();

    public Juego() {
    }

    public Juego(List<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void llenarJuego() {

        System.out.println("JUEGO RULETA RUSA PISTOLA DE AGUA");

        //Jugador nuevo = new Jugador();
        System.out.println("INDIQUE CANTIDAD DE JUGADORES HASTA 6 ");
        int cj = leer.nextInt();

        if (!(cj >= 1 && cj <= 6)) {
            cj = 6;
        }
        for (int i = 0; i < cj; i++) {
            Jugador nuevo = new Jugador();
            System.out.println("INDIQUE NOMBRE JUGADOR");
            nuevo.setNombre(leer.next());
            nuevo.setId(i + 1);
            jugadores.add(nuevo);
        }

        revolver.llenarRevolver();

    }

    public void rondas() {
        
        boolean mojado = false;
        do {
            for (Jugador jugador : jugadores) {
                mojado = jugador.disparo(revolver);
                if (mojado) {
                    break;
                }
                System.out.println(revolver.toString());

            }

        } while (!mojado);

        /*if (jugador.isMojado()) {
                System.out.println("EL JUEGO TERMINO, EL MOJADO ES: ");
            }
            System.out.println(jugador.toString());
            break;
        }*/
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

}
