/*
 Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Camping extends Alojamientos{
    
    private Integer carpasCap;
    private Integer banios;
    private boolean resto;

    public Camping() {
    }

    public Camping(Integer carpasCap, Integer banios, boolean resto, boolean privado, Integer metros2) {
        super(privado, metros2);
        this.carpasCap = carpasCap;
        this.banios = banios;
        this.resto = resto;
    }

    public Integer getCarpasCap() {
        return carpasCap;
    }

    public void setCarpasCap(Integer carpasCap) {
        this.carpasCap = carpasCap;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
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
        return "Camping: "
                + "\n" + super.toString()
                + "\nCapacidad de carpas: " + carpasCap
                + "\nBaños disponibles: " + banios 
                + "\nPosee restorante: " + resto ;
    }
    
    
    
    
}
