/*
Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Alojamientos {
    
    protected boolean privado;
    protected Integer metros2;

    public Alojamientos() {
    }

    public Alojamientos(boolean privado, Integer metros2) {
        this.privado = privado;
        this.metros2 = metros2;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getMetros2() {
        return metros2;
    }

    public void setMetros2(Integer metros2) {
        this.metros2 = metros2;
    }

    @Override
    public String toString() {
        return    "Privado: " + privado 
                + "\nSuperficie en metros 2: " + metros2;
    }
    
    
    
}
