/*

 */
package Entidades;

import Interface.calculosFormas;

/**
 *
 * @author Mariano Benegas
 */
public class Circulo implements calculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoPerimetro() {

        return 2 * PI * getRadio();
    }

    @Override
    public double calculoSuperficie() {
       
        return PI * (Math.pow(getRadio(),2));
    }

}
