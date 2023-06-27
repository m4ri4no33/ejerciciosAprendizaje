
package Entidades;

import Interface.calculosFormas;

/**
 *
 * @author Mariano Benegas
 */
public class Rectangulo implements calculosFormas{
    
    public double lado1;
    public double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    

    @Override
    public double calculoPerimetro() {
        return (getLado1()+getLado2())*2;
    }

    @Override
    public double calculoSuperficie() {
       return (getLado1()*getLado2());
    }
    
}
