
package Entidad;

/**
 *
 * @author Mariano Benegas
 */
public class Animal {
    private String ruido;

    public Animal() {
    }

    public Animal(String ruido) {
        this.ruido = ruido;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }
    
    public void hacerRuido(){
        System.out.println("¡¡HOLA!!");
    }
}
