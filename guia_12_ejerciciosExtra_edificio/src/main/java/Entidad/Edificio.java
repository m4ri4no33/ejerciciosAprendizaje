/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho,
alto y largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public abstract class Edificio {

    protected double ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
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

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    @Override
    public String toString() {
        return "ancho: " + ancho
                + "\n alto: " + alto
                + "\n largo: " + largo;
    }

}
