/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Hotel4 extends Hotel {

    private char gimnasio;
    private String nombreResto;
    private Integer capacResto;

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String nombreResto, Integer capacResto, Integer habitaciones, Integer camas, Integer pisos, double precioH) {
        super(habitaciones, camas, pisos, precioH);
        this.gimnasio = gimnasio;
        this.nombreResto = nombreResto;
        this.capacResto = capacResto;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public Integer getCapacResto() {
        return capacResto;
    }

    public void setCapacResto(Integer capacResto) {
        this.capacResto = capacResto;
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
        return "Hotel ****" 
                + "\n" + super.toString()
                + "\nCategoria gimnasio: " + gimnasio 
                + "\nNombre Restorante: " + nombreResto 
                + "\nCapacidad comensales: " + capacResto ;
    }

    @Override
    public double precioHabitacion() {
        
        double valor = 0;
        
        if (getCapacResto() < 30) {
            valor = 10;
        } else if (getCapacResto() >= 30 && getCapacResto() <= 50) {
            valor = 30;
        } else if (getCapacResto() > 50) {
            valor = 50;
        }
        if (getGimnasio() == 'A') {
            valor = valor + 50;
        } else if (getGimnasio() == 'B') {
            valor = valor + 30;
        }
        setPrecioH(super.precioHabitacion() + valor);
        
        return super.precioHabitacion() + valor;

    }

}
