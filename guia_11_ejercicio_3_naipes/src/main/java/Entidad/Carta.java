/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, 
bastos, oros y copas). Esta clase debe contener un método toString() que retorne
el número de carta y el palo.
 */
package Entidad;
/*
 * @author Mariano Benegas
 */
public class Carta {
    private int numero;
    private String palo;
    
    //public static final String[] palos = {"ESPADAS", "OROS", "COPAS", "BASTOS"};
    

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    

    @Override
    public String toString() {
        return "\n Carta " + numero +" "+ palo ;
    }
    
    
}
