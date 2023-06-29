
package Entidades;


public final class Yates extends BarcosMotor{
    
    private Integer camarotes;

    public Yates(Integer potencia, Integer matricula, Double eslora, Integer anoFabricacion, Integer camarotes) {
        super(potencia, matricula, eslora, anoFabricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yates{" + "camarotes=" + camarotes + '}';
    }

    @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler()+getCamarotes()); 
    }
    
    
    
}
