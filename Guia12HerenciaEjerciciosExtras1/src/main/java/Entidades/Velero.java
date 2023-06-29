
package Entidades;


public final class  Velero extends Barco{
   
    private Integer numeroMastiles;

    public Velero(Integer numeroMastiles, Integer matricula, Double eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }

    @Override
    public double calculaAlquiler() {
        return (super.calculaAlquiler()+getNumeroMastiles());
    
    }

  

  
    
    
    
}
