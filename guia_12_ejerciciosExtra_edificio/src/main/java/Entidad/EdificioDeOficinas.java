/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mariano Benegas
 */
public class EdificioDeOficinas extends Edificio {

    private int numOficinas;
    private int personasPorOfic;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int personasPorOfic, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasPorOfic = personasPorOfic;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getPersonasPorOfic() {
        return personasPorOfic;
    }

    public void setPersonasPorOfic(int personasPorOfic) {
        this.personasPorOfic = personasPorOfic;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double calcularSuperficie() {
        return getAncho() * getLargo();
    }

    @Override
    public double calcularVolumen() {
        return getAncho() * getLargo() * getAlto();
    }

    /*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    public void cantidadPersonas() {

        System.out.println("CANTIDAD DE PERSONAS POR PISO : " + (getPersonasPorOfic() * getNumOficinas()));
        System.out.println("CANTIDAD DE PERSONAS EN TODO EL EDIFICIO : "
                + (getPersonasPorOfic() * getNumOficinas()) * getNumPisos());

    }

    @Override
    public String toString() {
        return "Edificio de oficinas: "
                + "\n numero de oficinas: " + numOficinas
                + "\n personas por oficina: " + personasPorOfic
                + "\n numero de pisos: " + numPisos
                + "\n" + super.toString();
    }

}
