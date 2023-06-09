
package Entidad;

import java.util.List;

/*
 * @author Mariano Benegas
 */
public class Equipo {
    
    private List<Jugador> jugador;

    public Equipo() {
    }

    public Equipo(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugador=" + jugador + '}';
    }
    
    
    
}
