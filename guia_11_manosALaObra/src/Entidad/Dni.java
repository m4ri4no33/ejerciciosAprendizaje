/*
 
 */
package Entidad;

/*
 * @author Mariano Benegas
 */
public class Dni {
    private int numero;
    private String serie;

    public Dni() {
    }

    
    public Dni(int numero, String serie) {
        this.numero = numero;
        this.serie = serie;
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Dni{" + "numero=" + numero + ", serie=" + serie + '}';
    }
    
    
}
