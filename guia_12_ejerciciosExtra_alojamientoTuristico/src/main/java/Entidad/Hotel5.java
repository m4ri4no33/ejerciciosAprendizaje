/*
 • Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Hotel5 extends Hotel4 {

    private Integer cantSalonConferencia;
    private Integer cantSuites;
    private Integer cantLimusina;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonConferencia, Integer cantSuites, Integer cantLimusina, char gimnasio, String nombreResto, Integer capacResto, Integer habitaciones, Integer camas, Integer pisos, double precioH) {
        super(gimnasio, nombreResto, capacResto, habitaciones, camas, pisos, precioH);
        this.cantSalonConferencia = cantSalonConferencia;
        this.cantSuites = cantSuites;
        this.cantLimusina = cantLimusina;
    }

    public Integer getCantSalonConferencia() {
        return cantSalonConferencia;
    }

    public void setCantSalonConferencia(Integer cantSalonConferencia) {
        this.cantSalonConferencia = cantSalonConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimusina() {
        return cantLimusina;
    }

    public void setCantLimusina(Integer cantLimusina) {
        this.cantLimusina = cantLimusina;
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

    @Override
    public String toString() {
        return "Hotel *****"
                + "\n" + super.toString()
                + "\nCantidad Salones de Conferencia: " + cantSalonConferencia 
                + "\nCantidad Suites: " + cantSuites 
                + "\nCantidad Limusinas: " + cantLimusina ;
    }

    /*Valor agregado por las limosinas:
       • $15 por la cantidad de limosinas del hotel.
       POR CADA LIMOSINA???*/
    @Override
    public double precioHabitacion() {
        setPrecioH(super.precioHabitacion() + (getCantLimusina() * 15));
        return super.precioHabitacion() + (getCantLimusina() * 15);
    }

}
