
package Entidades;

/**
 *
 * @author Mariano Benegas
 */
public class Yates extends BarcoMotor{
    
    private Integer camarotes;

    public Yates() {
    }


    public Yates(Integer camarotes, Integer potencia, Integer matricula, Double eslora, Integer anoFabricacion) {
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
         return "TIPO YATE LUJO: "
                + "\n CAMAROTES : " + camarotes
                + "\n POTENCIA CV: " + super.getPotencia()
                + "\n MATRICULA : " + super.getMatricula()
                + "\n ESLORA : " + super.getEslora()
                + "\n MODELO : " + super.getAnoFabricacion();
    }
    
     @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler() + getCamarotes()); 
    }
    
}
