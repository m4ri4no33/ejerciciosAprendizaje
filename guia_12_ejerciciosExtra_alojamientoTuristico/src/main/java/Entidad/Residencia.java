/*
 Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Residencia extends Alojamientos{
    
    private Integer habitaciones;
    private boolean descuento;
    private boolean campoDep;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, boolean descuento, boolean campoDep) {
        this.habitaciones = habitaciones;
        this.descuento = descuento;
        this.campoDep = campoDep;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
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
        return "Residencia: "
                + "\n" + super.toString()
                + "\nCantidad de habitaciones: " + habitaciones 
                + "\nRealizan descuento gremial: " + descuento 
                + "\nPosee campo Deportivo: " + campoDep ;
    }
    
    
}
