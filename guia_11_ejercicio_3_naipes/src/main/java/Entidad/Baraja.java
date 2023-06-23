/*
 La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Mariano Benegas
 */
public class Baraja {

    private ArrayList<Carta> cartas = new ArrayList();
    private String[] palos = {"Espada", "Basto", "Oro", "Copa"};
    private ArrayList<Carta> monton = new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public String[] getPalos() {
        return palos;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setPalos(String[] palos) {
        this.palos = palos;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

   
    

    public void crearBaraja() {

        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i == 8 || i == 9) {
                    continue;
                }
                monton.add(new Carta(i, palo));
            }
        }

    }

    public void barajar() {

        Collections.shuffle(cartas);

        //for (Object carta : mazo) {
        //    System.out.println(carta);
        //}
    }

    public void siguienteCarta() {

    }

}
}
