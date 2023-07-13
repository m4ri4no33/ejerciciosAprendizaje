/*
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Hotel {

    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected double precioH = 50;

    public Hotel() {
    }

    public Hotel(Integer habitaciones, Integer camas, Integer pisos, double precioH) {
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioH = precioH;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public double getPrecioH() {
        return precioH;
    }

    public void setPrecioH(double precioH) {
        this.precioH = precioH;
    }

    public double precioHabitacion() {
        setPrecioH(getPrecioH() + (getCamas()));
        return getPrecioH() + (getCamas());
    }

    @Override
    public String toString() {
        return "Cantidad de habitaciones: " + habitaciones 
                + "\nCantidad de camas: " + camas 
                + "\nCantidad de pisos: " + pisos 
                + "\nPrecio base: " + precioH;
    }

}
