
package Entidades;

/**
 *
 * @author Mariano Benegas
 */
public class Barco {
    
    protected Integer matricula;
    protected Double eslora;
    protected Integer anoFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Double eslora, Integer anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anoFabricacion=" + anoFabricacion + '}';
    }
    
    
    
    
}
