
package Entidades;

public class BarcosMotor extends Barco {

    private Integer potencia;

    
    public BarcosMotor(Integer potencia, Integer matricula, Double eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "BarcosMotor{" + "potencia=" + potencia + '}';
    }

    @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler()+getPotencia() );
    }
    
    
    
    
}
