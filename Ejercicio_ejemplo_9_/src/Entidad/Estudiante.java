/*
 Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
 */
package Entidad;

/*
 * @author Mariano Benegas
 */
public class Estudiante {
    private String nombre;
    private double notaFinal;

    public Estudiante() {
    }

    public Estudiante(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "ALUMNO {" + "nombre = " + nombre + ", notaFinal = " + notaFinal + '}';
    }
    
}
