package Entidades;

/**
 *
 * @author Mariano Benegas
 */
public final class Velero extends Barco {

    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(Integer mastiles, Integer matricula, Double eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "TIPO VELERO:"
                + "\n MASTILES : " + mastiles
                + "\n MATRICULA : " + super.getMatricula()
                + "\n ESLORA : " + super.getEslora()
                + "\n MODELO : " + super.getAnoFabricacion();
        
    }

    @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler() + getMastiles());
    }

}
